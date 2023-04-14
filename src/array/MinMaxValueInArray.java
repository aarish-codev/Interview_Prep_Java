package array;

public class MinMaxValueInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 20, 13, 4, 53};
        int min = findMinimumValueInArray(arr);
        System.out.println("Minimum value in array is: " + min);
        int max = findMaximumValueInArray(arr);
        System.out.println("Maximum value in array is: " + max);

    }

    private static int findMinimumValueInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        return min;
    }

    private static int findMaximumValueInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
}
