package vehicles;



public class ElectricCar extends Vehicle{
    private String battery;
    public ElectricCar(double price, String make, String engine, String battery) {
        super(price, make, engine);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }
}
