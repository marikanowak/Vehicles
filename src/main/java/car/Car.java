package car;

import vehicles.Startable;
import vehicles.Vehicles;

public class Car extends Vehicles implements Startable {

    private int doors;

    public Car (int wheels, int doors){
        super(wheels);
        this.doors = doors;
    }

    @Override
    public void startengine() {
        System.out.println("GOOO!!!");
    }

    public void opendoor(){
        System.out.println("łup");
    }
}
