package oop.interfaces;

interface Bug {
    public void bugSound();
    public void bugSize();
}
interface Location{
    public void location();
}
class Ant implements Bug, Location{
    //"implements" in interface is the same as "extends" in abstract class
    public void bugSound() {
        System.out.println("Tsss");
    }
    public void bugSize() {
        System.out.println("Small");
    }
    public void location(){
        System.out.println("Forest");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSound();
        ant.bugSize();
        ant.location();
    }
}
