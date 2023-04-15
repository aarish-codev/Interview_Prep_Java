package array;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 3, 9, 8, 7, 6, 1};
        int missingNumber = getMissingNumber(arr);
        System.out.println("Missing number is: " + missingNumber);
    }

    private static int getMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }
}
