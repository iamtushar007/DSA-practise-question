package Patterns;

public class OddStarPyramidPattern {

    public static void main(String[] args) {
        int rows = 5;
        printOddStarPyramid(rows, 1);
    }

    public static void printOddStarPyramid(int n, int currentRow) {
        if (currentRow > n) {
            return;
        }

        printSpaces(n - currentRow);
        printStars(2 * currentRow - 1);

        System.out.println();
        printOddStarPyramid(n, currentRow + 1);
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
