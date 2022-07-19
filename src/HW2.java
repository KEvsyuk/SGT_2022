import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the speed in mp/h");
        float mph = scanner.nextFloat();
        float kmh = 1.6f * mph;
        System.out.println( mph + "mp/h in km/h would be equal to " + kmh + " km/h" );


    }


}

