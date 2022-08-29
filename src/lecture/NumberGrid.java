package lecture;

public class NumberGrid {
    public static void main(String[] args) {

        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //First for loop is for the line: we print everything until number of rows is reached; second is for rows
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }


}
