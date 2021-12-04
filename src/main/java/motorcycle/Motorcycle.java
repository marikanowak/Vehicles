package motorcycle;

import vehicles.Startable;
import vehicles.Vehicles;

public class Motorcycle extends Vehicles implements Startable {

    public Motorcycle (int wheels){
        super(wheels);
    }

    public void startengine(){
        System.out.println("Rumtumtum");
    }
}
