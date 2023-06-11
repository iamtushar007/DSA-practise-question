
public class SortedArray {
    static boolean isSortedArray(int[] arr, int index) {
        // Termination Case
        if (arr.length - 1 == index) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // 0,1,2,3,4(index will keep mmoving)
        // Small Problem (Moving Index) (Recursion(Cycle))
        return isSortedArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 20, 40, 50 };
        System.out.println(isSortedArray(arr, 0) ? "Array is sorted" : "Array is not sorted");
    }
}
