package org.example;

public class Bicycle extends Vehicle {

    public Bicycle(int id, String name, int velocity){
        super(id,name,velocity);
    }

    public int accelerate(int kmh) {
        if ((super.getVelocity() + kmh) < 35) {
            super.setVelocity(super.getVelocity() + kmh);
            System.out.println("Current Velocity: " + super.getVelocity() + kmh + " km/h");
            return super.getVelocity() + kmh;
        } else {
            System.out.println("It is not allowed to accelerate more then 35 km per hour");
            return super.getVelocity() + kmh;
        }

    }

}
