package Patterns;

public class InvertedHalfPyramidPattern {

    public static void printLine(int rows) {
        if (rows <= 0) {
            return;
        }
        printStar(rows);
        System.out.println();
        printLine(rows - 1);
    }

    public static void printStar(int num) {
        if (num <= 0) {
            return;
        }
        System.out.print("* ");
        printStar(num - 1);
    }

    public static void main(String[] args) {
        printLine(5);
    }
}
