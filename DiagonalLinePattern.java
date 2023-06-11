package Patterns;

public class DiagonalLinePattern {
    public static void main(String[] args) {
        int size = 5;
        printDiagonalLinePattern(size);
    }

    public static void printDiagonalLinePattern(int n) {
        printDiagonalLinePatternHelper(n, 1);
    }

    public static void printDiagonalLinePatternHelper(int n, int currentRow) {
        if (currentRow > n) {
            return;
        }

        for (int i = 1; i < currentRow; i++) {
            System.out.print("  ");
        }

        System.out.println("*");

        printDiagonalLinePatternHelper(n, currentRow + 1);
    }
}
