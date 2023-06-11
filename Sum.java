import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n;
        n = sc.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / i;
        }
        System.out.println("sum of series is " + sum);
    }
}
