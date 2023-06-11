package Patterns;

public class MirrorInvertedHalfPyramidPattern {

    public static void main(String[] args) {
        int rows = 5;
        printMirrorInvertedHalfPyramid(rows);
    }

    public static void printMirrorInvertedHalfPyramid(int n) {
        printPattern(n);
    }

    public static void printPattern(int rows) {
        if (rows <= 0) {
            return;
        }

        printStars(rows);
        System.out.println();

        printPattern(rows - 1);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("* ");

        printStars(count - 1);
    }
}
