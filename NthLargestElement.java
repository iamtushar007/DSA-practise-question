package Arrays;

public class NthLargestElement {

    static int NthLargest(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++)
            count[arr[i] - min]++;
        int rem = n;
        for (int i = count.length - 1; i >= 0; i--) {
            rem -= count[i];
            if (rem <= 0)
                return i + min;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 13, 1,
                10, 34, 16 };
        final int N = 4;
        System.out.println(NthLargest(arr, N));
    }
}
