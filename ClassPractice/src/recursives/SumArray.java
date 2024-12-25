package recursives;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = sumArray(arr);
        System.out.println(sum);
    }

    public static int sumArray(int[] arr) {
        return sumArrayRecursiveHelper(arr, arr.length);
    }
    public static int sumArrayRecursiveHelper(int[] arr, int n) {
        if(n == 0) return 0;

        return arr[n-1] + sumArrayRecursiveHelper(arr, n-1);
    }
}
