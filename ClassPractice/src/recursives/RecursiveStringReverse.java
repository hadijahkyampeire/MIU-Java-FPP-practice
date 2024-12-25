package recursives;

public class RecursiveStringReverse {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
        System.out.println(reverseString("midterm"));
    }

    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) {
           return "";
        }
        char lastChar = s.charAt(s.length() - 1);

        return lastChar + reverseString(s.substring(0, s.length() - 1));
    }
}
