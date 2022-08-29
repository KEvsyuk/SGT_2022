package Homework;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the required size of the array");
        int ArraySize = scanner.nextInt();
        int[] array1 = new int[ArraySize];

        for (int i=0; i < ArraySize; i++){
            System.out.println("Please, enter element number: " + (i+1));
            array1[i] = scanner.nextInt();
        }
        System.out.println("Source Array: ");
        for(int i = 0; i < ArraySize; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        /* Printing out all array's elements using for-each loop
        System.out.println("Source Array: ");
        for(int temp : array1){
            System.out.print(temp + " ");
        }
         */

    }
}
