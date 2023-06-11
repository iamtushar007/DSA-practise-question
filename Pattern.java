public class Pattern {

    static void printStar(int numberOfStar) {
        if (numberOfStar == 0) {
            return;
        }
        System.out.print("*");
        printStar(numberOfStar - 1);
    }

    static void printLine(int row, int star) {
        if (row == 0) {
            return;
        }
        printStar(star);
        System.out.println();// Print one Line(one row)
        printLine(row - 1, star + 1);
    }

    public static void main(String[] args) {
        final int MAXROW = 5;
        final int STAR = 1;
        printLine(MAXROW, STAR);
    }
}