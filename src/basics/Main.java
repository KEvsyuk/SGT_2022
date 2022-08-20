package basics;

public class Main {

public static void main(String[] args) {
    System.out.println("Hello, World!");

    //Declaration of variable x
    int x;

    //Initialization of variable x
    x=15;

    /*
    This is
    multiline
    comment
     */
    System.out.println(x);

    //Initialization and declaration in the same line
    int y = 10;
    System.out.println("y = " + y);

    //string in Java means text

    //string data type
    String name = "Ksenia";
    System.out.println(name);

    //Double data type
    double temperature = 36.6d;
    System.out.println(temperature);

    //the output is the same; but this will be in the text format
    String temperature2 = "36.6";
    System.out.println(temperature2);

    //Final variable(also paste examples of global and local)

    /* final double pie;
    pie = 3.141534234567d;
    pie = 10.87d; - an error since you can only assign the value to a final variable once */



}
}
