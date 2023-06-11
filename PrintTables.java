import java.util.Scanner;

public class PrintTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num;
        for (int i = 1; i <= n; i++) {
            num = i;
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + "=" + (num * j));
            }
            System.out.println("\n");
        }
    }
}
