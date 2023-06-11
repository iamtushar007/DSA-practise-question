
public class ArmstrongNumber {

    static void isAmno(int num, int sum) {
        // Termmination Case
        if (num != 0) {
            sum += Math.pow(num % 10, 3);
            isAmno(num / 10, sum);
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int num = 153;
        isAmno(num, 0);
    }
}
