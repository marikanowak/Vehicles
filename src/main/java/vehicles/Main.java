package vehicles;

import bike.Bike;
import car.Car;
import motorcycle.Motorcycle;
import trailer.Trailer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        Car car = new Car(4,2);
        Car car2 = new Car(4,4);
        Car car3 = new Car(4,5);
        Car car4 = new Car(4,3);

        Motorcycle motorcycle = new Motorcycle(2);
        Motorcycle motorcycle2 = new Motorcycle(2);
        Motorcycle motorcycle3 = new Motorcycle(2);
        Motorcycle motorcycle4= new Motorcycle(2);
        Motorcycle motorcycle5 = new Motorcycle(2);

        Trailer trailer = new Trailer(2);
        Trailer trailer2 = new Trailer(2);

        Bike bike = new Bike(2);
        Bike bike2 = new Bike(2);

        List<Car> cars = new ArrayList<Car>();

        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for(Car carsy: cars){
            carsy.opendoor();
            carsy.go();
            carsy.startengine();

        }

        List<Motorcycle> motorcycles = new ArrayList<Motorcycle>();

        motorcycles.add(motorcycle);
        motorcycles.add(motorcycle2);
        motorcycles.add(motorcycle3);
        motorcycles.add(motorcycle4);
        motorcycles.add(motorcycle5);

        for (Motorcycle motos: motorcycles){
            motos.go();
            motos.startengine();
        }

        List<Vehicles> vehicles = new ArrayList<Vehicles>();
        vehicles.add(motorcycle3);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(trailer);
        vehicles.add(bike2);

        for (Vehicles vehs: vehicles){
            vehs.turn();
            vehs.go();
            vehs.stop();
        }

        List<Bike> bikes = new ArrayList<Bike>();
        bikes.add(bike);
        bikes.add(bike2);

        for(Bike bikies: bikes){
            bikies.jump();
            bikies.go();
        }


        }





    }

