
import java.util.Scanner;

public class atmMachine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int b = 4000;
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for EXIT");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("enter money to withdrawn");
                int w = sc.nextInt();
                if (b >= w) {
                    b = b - w;
                    System.out.println("collect your money.");
                } else {
                    System.out.println("insufficient amount.");
                }
                break;
            case 2:
                System.out.print("Enter money to be deposited:");
                int d = sc.nextInt();
                b = b + d;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
            case 3:
                System.out.println("Balance : " + b);
                System.out.println("");
                break;
            case 4:
                System.exit(0);
        }
    }
}
