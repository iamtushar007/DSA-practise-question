public class TreeRecursion {

    static void branch(int x) {
        if (x >= 3) {
            return;
        }
        System.out.println(x);
        branch(x + 1); // inner call
        branch(x + 2); // outer call

    }

    public static void main(String[] args) {
        branch(0);
    }
}
