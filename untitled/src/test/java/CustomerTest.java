import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    PetrolCar petrolCar;
    ElectricCar electricCar;
    HybridCar hybridCar;
    @Before
    public void before (){
        customer = new Customer(79_000);
        petrolCar = new PetrolCar(52_000, "Toyota", "Petrol", "Catalytic Converters");
        electricCar = new ElectricCar(52_000, "Toyota", "Electric", "72000 watts");
        hybridCar = new HybridCar(40_000, "BMW", "Hybrid", "Converter", "500 watts");
    }
    @Test
    public void hasMoney(){
        assertEquals(79_000, customer.getMoney(), 0.00);
    }
    @Test
    public void hasEmptyCarList(){
        assertEquals(0, customer.countVehicles());
    }

    @Test
    public void canAddVehicles(){
        customer.addVehicle(petrolCar);
        customer.addVehicle(electricCar);
        customer.addVehicle(hybridCar);
        assertEquals(3, customer.countVehicles());
    }

}
