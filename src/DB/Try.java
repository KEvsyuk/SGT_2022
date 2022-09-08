package DB;

public class Try {
    public static void main(String[] args) {

        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[2]);
            //System.out.println(numbers[3]);

        } catch (Exception e){
            System.out.println(e);
            System.out.println("Something went wrong");
        }

        System.out.println("Hello world!");

        // we need try-catch block to hide the exception error and execute the code situated after



    }
}
