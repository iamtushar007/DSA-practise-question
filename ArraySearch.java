
public class ArraySearch {

    static int search(int arr[], int index, int searchValue) {
        // Termination Case
        if (arr.length == index) {
            return -1;
        }
        if (arr[index] == searchValue) {
            return index;
        }
        return search(arr, index + 1, searchValue);
    }

    public static void main(String args[]) {
        int arr[] = { 10, 90, 100, 20, 40, 88 };
        int searchValue = 20;

        System.out.println(search(arr, 0, searchValue) >= 0 ? "Element Found" : "Element Not Found");
    }
}
