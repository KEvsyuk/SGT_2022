import java.util.Scanner;
public class Printout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int p = scanner.nextInt();
        if (p >= 0){
        do {
            System.out.println(p);
            p--;}
            while (p!=-1);}
        else { do {
            System.out.println(p);
            p++;}
        while (p!=1);}

    }
}
