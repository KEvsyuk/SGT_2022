package Homework;

import static Homework.MinMaxMethods.*;
//To call the class: import static package.file.*;

public class ClassCallingExample {
    public static void main(String[] args) {

        int [] my_array = {10,243,64,23,2,5345,234,54,4,46,600};
        System.out.println(min(my_array));
        System.out.println(max(my_array));

        //When called, class transmits all contents
    }
}
