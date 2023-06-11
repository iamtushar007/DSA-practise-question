package Patterns;

public class MirrorLeftPyramidPattern {

    public static void main(String[] args) {
        int rows = 5;
        printRightPyramid(rows);
    }

    public static void printRightPyramid(int n) {
        printPattern(n, 1);
    }

    public static void printPattern(int rows, int currentRow) {
        if (currentRow > rows) {
            return;
        }

        printSpaces(rows - currentRow);
        printStars(currentRow);
        System.out.println();
        printPattern(rows, currentRow + 1);
    }

    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("  ");

        printSpaces(count - 1);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("* ");

        printStars(count - 1);
    }
}
