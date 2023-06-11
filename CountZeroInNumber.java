public class CountZeroInNumber {

    static int countZero(int num) {
        if (num == 0) {
            return 0;
        }
        int singleDigit = num % 10;
        int count = countZero(num / 10);
        if (singleDigit == 0) {
            count++;
        }
        return count;
    }

    static void countZero(int num, int count) {
        if (num == 0) {
            System.out.println("Count " + count);
            return;
        }

        int singleDigit = num % 10;
        if (singleDigit == 0) {
            count++;
        }
        countZero(num / 10, count);
    }

    public static void main(String[] args) {
        System.out.println("Count " + countZero(102030400));
        countZero(10203040, 0);
    }
}
