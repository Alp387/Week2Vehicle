package org.example;

public class Car extends Vehicle{

    public Car(int id,String name, int velocity) {
        super(id, name,velocity);
    }


    public int accelerate(int kmh){
    super.setVelocity(super.getVelocity()+kmh);
    System.out.println("Current Velocity: "+super.getVelocity() + " km/h");
    return super.getVelocity();
}

}
