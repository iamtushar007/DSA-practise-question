import java.util.Scanner;

public class Grades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in english:");
        int E = sc.nextInt();
        System.out.println("enter marks in maths:");
        int M = sc.nextInt();
        System.out.println("enter marks in computer");
        int C = sc.nextInt();
        int total = E + M + C;
        System.out.println("your total marks is:" + total);
        int p = (total * 100) / 300;
        if (p >= 90) {
            System.out.println("you got A grade.");
        } else if (p >= 70 && p < 90) {
            System.out.println("you got B grade.");
        } else if (p >= 60 && p < 70) {
            System.out.println("you got C grade.");
        } else if (p >= 50 && p < 60) {
            System.out.println("you got D grade.");
        } else {
            System.out.println("you got F grade.");
        }
    }
}
