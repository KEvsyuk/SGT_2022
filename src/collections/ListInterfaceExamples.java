package collections;

import java.util.ArrayList;

public class ListInterfaceExamples {
    public static void main(String[] args) {

        //ArrayList Declaration
        ArrayList<String> car = new ArrayList<String>();
        //it has no size now (and no elements). But you can add/delete elements anytime you like
        //Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //To print out all elements
        System.out.println(car);

        //Get elements by index (indexes start from 0; meaning Volvo has an index 0)
        System.out.println(car.get(1));

        //Add element at specific index
        car.add(2, "Ford");
        System.out.println(car);

        //Change element's value
        car.set(3, "Toyota");
        System.out.println(car);

        //Remove element at specific index
        car.remove(5);
        System.out.println(car);

        //Size of the collection
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);



    }
}
