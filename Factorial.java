
public class Factorial {
    static int fact(int num) {
        // Termination Case
        if (num == 1 || num == 0) {
            return 1;
        }
        int result = fact(num - 1); // small problem
        return result * num;
    }

    static void fact(int num, int result) {
        if (num == 1 || num == 0) {
            System.out.println(result);
            return; // exits from the function
        }
        fact(num - 1, num * result); // Small Problem
    }

    public static void main(String[] args) {
        // fact(5, 1);
        System.out.println(fact(5));
    }
}