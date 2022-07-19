public class Operators {
    public static void main(String[] args) {

        //Math operators + - / * %
        //operator '=-' subtraction operation; '=+' addition operation

        int x = 100;
        x += 100; /*operator takes an existing value of x and increases it by the amount declared
        same as x = x + 100; */
        /*if we assign new value (e.g. write x = 3) it will show x = 3
        and don't take previous values into account*/

        System.out.println("x = " + x);

        /* 10 % 3 = '10/3 = 3 1/2' = 1.
        The result is the remainder from the division */

        //INCREMENTATION OPERATORS
        //Post-incrementation
        int num = 10;
        System.out.println("num = " + num ++);
        System.out.println("num = " + num);

        //Pre-incrementation
        int num2 = 20;
        System.out.println("num2 = " + ++num2);

        //Increase or decrease variable by one
        int var = 10;
        var += 1;
        var = var + 1;
        ++var;
        var++;

        var -= 1;
        var = var - 1;
        --var;
        var--;

        //RELATION OPERATORS
        //Equality ==
        int a = 1;
        int b = 10;
        System.out.println("Equality = " + (a == b)); //is a equal to b?

        //Inequality !=
        System.out.println("Inequality - " + (a != b)); //is a not equal to b?
        //Greater than > and greater than or equal to >=
        System.out.println(a > b); //if a is greater than b
        System.out.println(a >= b); // if a is greater or equal to b

        //Less than < and less than or equal to <=
        System.out.println(a < b);
        System.out.println(a <= b);

        //Logical operators
        //Logical AND - &&
        boolean wind = true;
        boolean weather = true;
        System.out.println(wind && weather);

    }
}
