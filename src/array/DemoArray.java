package array;

import java.util.Arrays;

public class DemoArray {

    public static void main(String[] args) {

// DEFINING ARRAYS

        // dataType[] arrName = new dataType[size];
        int arr1[];

        // dataTYpe arrName[] = new dataType[size]
        int[] arr2;

        // inline declaration & initialization
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = new int[]{6, 7, 8, 9, 10};

// INITIALIZING ARRAYS
        arr1 = new int[5];
        arr2 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));


// ADDING/UPDATING ARRAYS
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[4] = 5;
        arr1[1] = 20;
        System.out.println("Array 1 after updating: "+Arrays.toString(arr1));

// LENGTH OF ARRAY
        System.out.println("Length of array 1: " + arr1.length);

    }
}
