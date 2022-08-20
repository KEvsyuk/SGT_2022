package Homework;

import java.util.Scanner;
public class PrintoutNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int input = scanner.nextInt();

        if (input >= 0){
           for (int p = input; p >= 0; p--){
            System.out.print( p + " " );
           }
        } else {
            for(int p= input; p <= 0; p++) {
            System.out.print( p + " ");
          }
        }
        }

    }

