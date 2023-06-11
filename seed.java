import java.util.Scanner;

public class seed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a;
        while (a != 0) {
            int t = a % 10;
            mul *= t;
            a /= 10;
        }
        if (mul == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
