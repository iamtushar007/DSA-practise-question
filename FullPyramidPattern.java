package Patterns;

public class FullPyramidPattern {

    public static void main(String[] args) {
        int rows = 5;
        printKiteStarPattern(rows, 1);
    }

    public static void printKiteStarPattern(int n, int currentRow) {
        if (currentRow <= n) {
            printSpaces(n - currentRow);
            printStars(2 * currentRow - 1);
            System.out.println();
            printKiteStarPattern(n, currentRow + 1);
        } else if (currentRow <= 2 * n - 1) {
            printSpaces(currentRow - n);
            printStars(2 * (2 * n - currentRow) - 1);
            System.out.println();
            printKiteStarPattern(n, currentRow + 1);
        }
    }

    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print(" ");
        printSpaces(count - 1);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("*");
        printStars(count - 1);
    }
}
