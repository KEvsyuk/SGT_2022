package basics;

public class PrintFormatting {
    public static void main(String[] args) {

        String name = "Bob";
        int age = 29;

        System.out.println("Hello, " + name + ". Your age is " + age);
        System.out.printf("Hello %s your age is %d \n", name, age);

        /* s - string
           d - decimal/integers
           f - float, double
           c - char
           b - boolean
         */
        double height = 192.456767d;
        System.out.printf("%s is %.2f cm tall", name, height);
    }
}
