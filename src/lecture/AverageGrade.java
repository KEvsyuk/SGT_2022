package lecture;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the required size of the array");
        int ArraySize = scanner.nextInt();
        float[] array1 = new float[ArraySize];

        for (int i = 0; i < ArraySize; i++) {
            System.out.println("Please, enter element number: " + (i + 1));
            array1[i] = scanner.nextInt();
        }
        System.out.println("Source Array: ");
        for (int i = 0; i < ArraySize; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        float sum = 0;
        for (int i = 0; i < ArraySize; i++) {
            sum = array1[i] + sum;
        }
        System.out.println("Average grade: " + (sum/array1.length));
        System.out.println("Number of elements: " + array1.length);

    }
}
