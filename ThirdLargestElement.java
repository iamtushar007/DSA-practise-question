package Arrays;

public class ThirdLargestElement {

    static void ThirdLargest(int arr[], int arr_size) {
        if (arr_size < 3) {
            System.out.println("3 elements required");
        }

        // first largest element
        int first = arr[0];
        for (int i = 1; i < arr_size; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }

        // second largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        // third largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }

        System.out.println("first largest element " + first);
        System.out.println("second largest element " + second);
        System.out.println("third largest element " + third);

    }

    public static void main(String[] args) {
        int arr[] = { 12, 13, 1,
                10, 34, 16 };
        int n = arr.length;
        ThirdLargest(arr, n);

    }
}
