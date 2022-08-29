package Homework;

import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {

        int[] sourceArray = new int[8];
        sourceArray[0] = 53;
        sourceArray[1] = 24;
        sourceArray[2] = 7;
        sourceArray[3] = 11;
        sourceArray[4] = 86;
        sourceArray[5] = 0;
        sourceArray[6] = 1;
        sourceArray[7] = 6;

        int[] newArray = new int[8];
        for(int i = 0; i < sourceArray.length; i++){
            newArray[i] = sourceArray[i];
        }
        System.out.println("Source array: " + Arrays.toString(sourceArray));
        System.out.println("New array: " + Arrays.toString(newArray));

        /* 1) Import Arrays
           2) Remember Arrays.toString(array)); to print all elements of the array
         */

    }
}
