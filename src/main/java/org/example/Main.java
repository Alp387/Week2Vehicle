package org.example;

public class Main {
    public static void main(String[] args) {


        Vehicle nissanNote = new Car(1,"Nissan Note", 0);
        System.out.println("Testing Car "+nissanNote);
        nissanNote.accelerate(5);
        nissanNote.accelerate(5);
        nissanNote.accelerate(50);

Vehicle hercules = new Bicycle(2 , "Hercules Black", 0);
        System.out.println("Testing Bike: "+hercules);

        System.out.println(hercules.getVelocity());
        hercules.accelerate(5);
        hercules.accelerate(25);
        hercules.accelerate(10);
        hercules.accelerate(8);

    }
}