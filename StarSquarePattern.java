package Patterns;

public class StarSquarePattern {

    public static void printStars(int num) {
        if (num <= 0) {
            return;
        }
        System.out.print("* ");
        printStars(num - 1);
    }

    public static void printPattern(int rows, int star) {
        if (rows <= 0) {
            return;
        }

        printStars(star);
        System.out.println();
        printPattern(rows - 1, star);
    }

    public static void main(String[] args) {
        printPattern(5, 5);
    }
}