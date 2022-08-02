package Homework;

public class ReverseArray {
    public static void main(String[] args) {
        int[] sourceArray = {3, 5, 6, 50 , 8, 8, 9, 9, 5};
        System.out.println("Source array: " + Arrays.toString(sourceArray));

        for (int i=0; i<sourceArray.length/2; i++){
            int temp = sourceArray[i];
            sourceArray[i]= sourceArray(sourceArray -i-1);

        }
    }
}
