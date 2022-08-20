package basics;

public class Char_example {
    public static void main(String[] args) {

        char ch = 'M';
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //cast from int to char
        System.out.println((char) 122);

        //Print out all lower case alphabet letters

        for (char cha = 'a'; cha <= 'z'; cha++) {
            System.out.print( cha + " " );
        }
    }
}
