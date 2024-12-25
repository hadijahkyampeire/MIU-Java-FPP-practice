package recursives;

public class RecursiveMaxValue {
    public static void main(String[] args) {
        int[] arr = {5, -3, 6, 1, 9, 4 };
        System.out.println(maxValue(arr));
    }
    public static int maxValue(int arr[]) {
        return findMaxValue(arr, 0, Integer.MIN_VALUE);
    }

    private static int findMaxValue(int arr[], int index, int max) {
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return findMaxValue(arr, index + 1, max);
    }
}
// Arr.length == 6
// index 0, max - -3, - New max - 5
// index 1, m -- 5, new max -- 5
// index 2, m 6
// index 3, m 6,
// index 4, m 9,
// index 5 , m 9,
//