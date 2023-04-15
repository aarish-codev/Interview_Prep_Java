package array;

import java.util.Arrays;

public class ResizeArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ResizeArray resizeArray = new ResizeArray();
        arr = resizeArray.resizeArray(arr, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Size: " + arr.length);
    }

    public int[] resizeArray(int[] arr, int capacity) {
        int[] res = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        arr = res;
        return arr;
    }
}
