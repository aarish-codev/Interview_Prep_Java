package array;

import java.util.Arrays;

/*

Given array of integers, write a function to move all 0's to end of it while maintaining relative order of non zero elements
Eg-> {0,1,0,4,12} --> {1,4,12,0,0}
 */
public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 0, 7, 12};
        int[] res = moveZeroToEnd(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
                j++;
        }
        return arr;
    }
}
