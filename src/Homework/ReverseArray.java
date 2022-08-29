package Homework;

import java.util.Arrays;
public class ReverseArray {
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

        System.out.println("Reverse array: " + Arrays.toString(sourceArray));

        int[] ReverseArray = new int[8];
        for (int i = 0; i < sourceArray.length; i++) {
                ReverseArray[i] = sourceArray[ReverseArray.length - i - 1];
        }
        System.out.println("Reverse array: " + Arrays.toString(ReverseArray));
    }
}
