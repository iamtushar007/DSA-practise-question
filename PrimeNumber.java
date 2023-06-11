import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        int flag = 1;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        if (flag > 2 || n == 1) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
