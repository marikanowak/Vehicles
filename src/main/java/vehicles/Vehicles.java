package vehicles;

public abstract class Vehicles {

    private int wheels;

    public Vehicles (int wheels){
    this.wheels = wheels;}

    public void turn(){
        System.out.println("Pivot, PIVOT");
    }

    public void go(){
        System.out.println("Wziummmmm");
    }

    public void stop(){
        System.out.println("STOP");
    }




}
