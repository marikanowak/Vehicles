package bike;

import vehicles.Vehicles;

public class Bike extends Vehicles {

    public Bike (int wheels){
        super(wheels);
    }
    public void jump(){
        System.out.println("HOPSA");
    }
}
