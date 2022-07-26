public class ArrayExamples {
    public static void main(String[] args) {

        //Declare Array that will hold 3 String type variables
        String[] names = new String[3];

        //How to set array's element values
        names[0] = "Ksenia";
        names[1] = "Janis";
        names[2] = "Peteris";

        //How to get array's element values
        System.out.println(names[0]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 5;
        grades[2] = 7;
        grades[3] = 1;
        grades[4] = 9;
        grades[5] = 4;
        grades[6] = 10;
        grades[7] = 3;
        grades[8] = 8;
        grades[9] = 2;

        //How to get array's size
        System.out.println("Array's size: " + grades.length);

        //Print ouy all elements (with the help of loops)
        for (int i=0; i < grades.length;i++ ){
            System.out.print(grades[i]);
        }
    }
}
