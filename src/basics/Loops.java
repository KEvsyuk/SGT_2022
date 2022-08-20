package basics;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        /*   System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");  */

        //'i++' means 'increase i by 1'
        //'for' loop - defined number of repetitions
        for(int i = 0; i < 10; i++){
            System.out.println("Hello, Ksenia!" + i );
        }

        /* 'while' loop - number of repetitions is undefined,
        the user decides how many times the action will be done */

        /* global and local variables; depends on the level
        of the code you declare it on */
        int i = 0;
        while(i < 10){
            System.out.println("Hello, World!");
            i++;
        }
        //runs infinite amount of times

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any number");
        int input = scanner.nextInt();

        while (input != 0){
            System.out.println("+180");
            System.out.println("Please, enter any number");
            input = scanner.nextInt();
        }

        //'do while' loop
        int j = 10;
        while (j<10){
            System.out.println("This is While loop");
            j++;
        }

        do{
            System.out.println("This is Do While loop");
            j++;
        } while (j<10);
        /*difference - 'while' starts the process from checking the very first iteration;
        'do while' executes the code once and only then checks the condition */



    }
}
