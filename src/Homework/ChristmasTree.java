package Homework;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the tree size");
        int treeSize = scanner.nextInt();

        //Each level
        for(int i = 0; i < treeSize; i++){
            //Spaces
            for(int j = 0; j < treeSize - 1 - i; j++){
                System.out.print(" ");
            }
            //Starts
            for(int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            //Move to next line
            System.out.println();
        }
        //Base level
        for(int i = 0; i < treeSize - 1; i++){
            System.out.print(" ");
        }
        System.out.println("#");

    }
}
