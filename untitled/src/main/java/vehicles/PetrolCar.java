package vehicles;

public class PetrolCar extends Vehicle{
    private String converter;

    public PetrolCar(double price, String make, String engine, String converter) {
            super(price, make, engine);
            this.converter = converter;
        }

        public String getConverter() {
            return converter;
        }
    }

