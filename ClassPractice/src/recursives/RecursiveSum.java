package recursives;

public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(recursiveSum(53456));
    }

    public static int recursiveSum(int num) {
        if(num >= 0 && num < 10) {
            return num;
        }
        return (num % 10) + recursiveSum(num / 10);
    }
}

// First round