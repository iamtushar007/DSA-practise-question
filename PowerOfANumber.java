
public class PowerOfANumber {

    static void powerOfNumber(int num, int power, int result) {
        if (power == 0) {
            System.out.println(result);
            return;
        }
        result = result * num;
        powerOfNumber(num, power - 1, result);
    }

    static int powerOfNumber(int num, int power) {

        if (power == 0) {
            return 1;
        }
        int result = powerOfNumber(num, power - 1);
        return result * num;
    }

    public static void main(String[] args) {
        powerOfNumber(2, 10, 1);
        powerOfNumber(2, 10);
    }
}
