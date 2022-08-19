package oop.abstraction;

abstract class Animal {
    protected String name;
    public void sleep(){
        System.out.println("zzzzz");

    }
}

class Pig extends Animal{

}


public class AbstractClassExample {
    public static void main(String[] args) {
        //Animal animal = new Animal;

        Pig pig = new Pig();
        pig.sleep();
        pig.name = "Peppe";

    }
        }