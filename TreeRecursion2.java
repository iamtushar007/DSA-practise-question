
public class TreeRecursion2 {

    static void print(int n) {
        if (n > 0) {
            System.out.println(n);
            print(n - 1);
            print(n - 2);
        }
    }

    public static void main(String[] args) {
        print(3);
    }
}
