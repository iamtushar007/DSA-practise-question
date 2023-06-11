import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int a = x;
        int b = y;
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int GCD = b;
        System.out.println("GCD is " + GCD);
        int LCM = (x * y) / GCD;
        System.out.println("LCM is " + LCM);

    }
}
