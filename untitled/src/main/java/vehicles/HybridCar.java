package vehicles;

public class HybridCar extends PetrolCar{

    private String battery;


    public HybridCar(double price, String make, String engine, String converter, String battery) {
        super(price, make, engine, converter);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }
}

