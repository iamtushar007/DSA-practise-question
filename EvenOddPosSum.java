public class EvenOddPosSum {

    static int[] sumEvenOddPos(int num, int pos) {
        // termination case
        if (num == 0) {
            int result[] = new int[2];
            return result;
        }
        // small problem
        int arr[] = sumEvenOddPos(num / 10, pos + 1);
        int digit = num % 10;
        if (pos % 2 != 0) {
            arr[0] = arr[0] + digit;
        } else {
            arr[1] = arr[1] + digit;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = sumEvenOddPos(27895, 0);
        System.out.println("Odd Sum" + arr[0]);
        System.out.println("Even Sum" + arr[1]);
    }
}
