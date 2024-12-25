package recursives;

public class RecursionCountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("hello suioeq"));
    }

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) return 0;
        char first = str.charAt(0);
        int count = 0;
        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u')  {
            count++;
        }
        return count + countVowels(str.substring(1));
    }

}
