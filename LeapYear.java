import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        System.out.println("enter year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("the year not a leap year");
        }
    }
}
