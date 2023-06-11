import java.util.Scanner;

public class hotelMenu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\t\thotel menu list");
        System.out.println("\t\t1.choose 1 for pizza.");
        System.out.println("\t\t2.choose 2 for burger.");
        System.out.println("\t\t3.choose 3 for coffee.");
        System.out.println("\t\t4.choose 4 for biryani.");
        System.out.println("Select your menu");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("you have selected pizza");
        }
        if (choice == 2) {
            System.out.println("you have selected burger");
        }
        if (choice == 3) {
            System.out.println("you have selected coffee");
        }
        if (choice == 4) {
            System.out.println("you have selected biryani");
        }
    }
}
