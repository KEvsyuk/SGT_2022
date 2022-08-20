package lecture;

import java.util.Scanner;
public class StringInputPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and Age (John 30)");

        //Read string from user and get rid of spaces (trim)
        //Get substring of the last two characters in the string
        //Convert those to integer
        //If age is over 70, then print "Senior"; if not, print "Adult"

        String name_age = scanner.nextLine().trim();
        name_age = name_age.substring(name_age.length()-2);
        int age = Integer.parseInt(name_age);
        if(age > 70){
            System.out.println("Senior");
        }else{
            System.out.println("Adult");
        }



    }
}
