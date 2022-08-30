package Homework.MaximumDistance;

public abstract class Vehicle {


    //Fields
    private float fuel;
    private double fuelUsage;
    private int passengers;



    //Setter methods
    public void setFuel(){
        fuel = 1600;
    }
    public void setPassengers() {
        passengers = 4;
    }
    //fuel usage is in liters/100km
    public void setFuelUsage() {
        fuelUsage = 3;
        if(passengers > 0){
            fuelUsage = fuelUsage*passengers*1.05;


        }
    }

}
