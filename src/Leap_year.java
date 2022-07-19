import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the year");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("It's a leap year");
        } else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("It's a leap year");
        } else{
            System.out.println("It's not a leap year");
        }
    }
}

