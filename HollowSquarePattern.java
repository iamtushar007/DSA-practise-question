
package Patterns;

public class HollowSquarePattern {

    public static void main(String[] args) {
        int size = 5;
        printHollowSquare(size);
    }

    public static void printHollowSquare(int n) {
        printPattern(n, n);
    }

    public static void printPattern(int rows, int cols) {
        if (rows <= 0) {
            return;
        }

        printRow(cols);
        System.out.println();

        printPattern(rows - 1, cols);
    }

    public static void printRow(int cols) {
        if (cols <= 0) {
            return;
        }

        if (cols == 1 || cols == 5  ) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }

        printRow(cols - 1);
    }
}
