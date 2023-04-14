package array;

import java.util.Arrays;

/*
Question -> Given array of integers, return array with even integers removed
* */
public class RemoveEvenOddIntegers {

    public static void main(String[] args) {
        int[] origArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = removeEven(origArr);
        System.out.println("Even numbers removed: "+Arrays.toString(result));

        result = removeOdd(origArr);
        System.out.println("Odd numbers removed: "+Arrays.toString(result));
    }

    private static int[] removeEven(int[] origArr) {
        int index = 0;
        for (int i = 0; i < origArr.length; i++) {
            if (origArr[i] % 2 != 0)
                index++;
        }
        int[] result = new int[index];
        index = 0;
        for (int i = 0; i < origArr.length; i++) {
            if (origArr[i] % 2 != 0) {
                result[index] = origArr[i];
                index++;
            }
        }
        return result;
    }


    private static int[] removeOdd(int[] origArr) {

        int index = 0;
        for (int i = 0; i < origArr.length; i++) {
            if (origArr[i] % 2 == 0)
                index++;
        }
        int[] result = new int[index];
        index = 0;
        for (int i = 0; i < origArr.length; i++) {
            if (origArr[i] % 2 == 0) {
                result[index] = origArr[i];
                index++;
            }
        }
        return result;
    }
}
