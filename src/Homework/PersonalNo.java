package Homework;

import java.util.Scanner;

public class PersonalNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        System.out.println("Please, enter your personal number ");
        String personalNo = scanner.nextLine();

        if(personalNo = "*****-*****"){
            System.out.println("Your inputted personal number is valid");
        }else{
            System.out.println("Your inputted personal number is invalid");
        }

    }



}
