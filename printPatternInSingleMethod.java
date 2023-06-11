public class printPatternInSingleMethod {

    static void printLeftPyramidPattern(int row, int star) {
        if (row == 0)
            return;

        if (star > 0) {
            System.out.print("*");
            printLeftPyramidPattern(row, star - 1);
        } else {
            System.out.println();
            printLeftPyramidPattern(row - 1, row - 1);
        }

    }

    public static void main(String[] args) {
        printLeftPyramidPattern(5, 5);
    }
}
