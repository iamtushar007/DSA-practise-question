public class sumOfNaturalNumbers {

    static int sumOfNaturalNumbers(int num) {
        if (num == 0) {
            return 0;
        }
        int sum = sumOfNaturalNumbers(num - 1);
        sum = sum + num;
        return sum;
    }

    static void sumOfNaturalNumbers(int num, int sum) {
        if (num == 0) {
            System.out.println("Sum " + sum);
            return;
        }
        sum = sum + num;
        sumOfNaturalNumbers(num - 1, sum);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(50));
        sumOfNaturalNumbers(50, 0);
    }
}
