package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] res = new int[arr.length];

        System.out.println("Initial Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - 1 - i] = arr[i];
        }
        System.out.println("Array reversed: " + Arrays.toString(res));

        System.out.println("Method 2");
        res = reverseArray(arr, 0, arr.length - 1);
        System.out.println("Method 2 array reversed: " + Arrays.toString(res));
    }

    private static int[] reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
