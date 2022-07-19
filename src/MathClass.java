public class MathClass {
    public static void main(String[] args) {
        float num = 5.154f;
        System.out.println(num);

        //Rounding down (the output is in double format)
        System.out.println(Math.floor(num));

        //Rounding up (the output is in double format)
        System.out.println(Math.ceil(num));

        //Rounding according to Math principles (integer format)
        System.out.println(Math.round(num));

        //Absolute values (how far you are from 0; -100 and 100 are equal)
        System.out.println(Math.abs(-100));

        //Power (what we want to bring to the power, power)
        System.out.println(Math.pow(2,3));

        //Square root
        System.out.println(Math.sqrt(256));

        //Finding max value between two values
        System.out.println(Math.max(103.6,100));

        //Finding min value between two values
        System.out.println(Math.min(49,200));

        //If needed to compare more than two values:
        System.out.println(Math.max(Math.max(10,39),Math.max(90,8)));

        //Random value (from 0 to 1)
        System.out.println(Math.random());
        //Multiplied by 10
        System.out.println(Math.random() * 10);

        //Replacing the type of variable with another - conversion - smaller data type to bigger = no loss of data
        int i = 25;
        float j = i;
        System.out.println(j);

        /*Casting - loss of data while converting
        (digits after dot are lost)*/
        double n = 99.9998;
        int m = (int)n;
        System.out.println(m);

        /* Random value from 1 to 20
        (somewhat a general formula) */
        System.out.println((int) (Math.random() * 20) + 1);
/*pwd - shows path
cd - change directory
ls - shows all folders and files
cd .. - brings you out of the folder

 */

    }
}
