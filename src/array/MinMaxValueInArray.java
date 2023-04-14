package array;

public class MinMaxValueInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 20, 34, 13, 4, 53, 33};
        int min = findMinimumValueInArray(arr);
        System.out.println("Minimum value in array is: " + min);
        int max = findMaximumValueInArray(arr);
        System.out.println("Maximum value in array is: " + max);
        System.out.println("2nd Maximum value in array is: " + find2ndMaxValue(arr));
    }

    private static int findMinimumValueInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) min = j;
        }
        return min;
    }

    private static int findMaximumValueInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) max = j;
        }
        return max;
    }

    private static int find2ndMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] > secondMax && arr[i] < max)
                secondMax = arr[i];

        }
        return secondMax;
    }
}
