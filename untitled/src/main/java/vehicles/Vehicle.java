package vehicles;

import behaviours.IOwn;

public abstract class Vehicle implements IOwn {
    private double price;
    private String make;
    private String engine;
    public Vehicle (double price, String make, String engine){
        this.price = price;
        this.make = make;
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getEngine() {
        return engine;
    }
}
