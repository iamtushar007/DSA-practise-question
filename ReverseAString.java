
public class ReverseAString {
    static String reverse(String str) {
        // Termination Case
        // if (str.length() == 0) {
        // return "";
        // }

        // Optimizing
        // if (str.length() == 1) {
        // return String.valueOf(str.charAt(0));
        // }

        // Optimizing+1
        if (str.length() == 1) {
            return str;
        }

        // Small Problem(Make the string small)+Recursion(Cycle)
        String smallString = str.substring(1);
        String smallResult = reverse(smallString);
        // processing logic
        char firstChar = str.charAt(0);
        return smallResult + firstChar;
    }

    public static void main(String[] args) {
        System.out.println(reverse("amit"));
    }
}
