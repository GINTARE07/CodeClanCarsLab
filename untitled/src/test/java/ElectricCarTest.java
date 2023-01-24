import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;


public class ElectricCarTest {
    ElectricCar electricCar;

    @Before
    public void before (){
        electricCar = new ElectricCar(52_000, "Toyota", "Electric", "72000 watts");
    }
    @Test
    public void hasPrice(){
        assertEquals(52_000, electricCar.getPrice(),0.00);
    }
    @Test
    public void hasMake(){
        assertEquals("Toyota", electricCar.getMake());
    }
    @Test
    public void hasEngineType(){
        assertEquals("Electric", electricCar.getEngine());
    }
    @Test
    public void hasBattery(){
        assertEquals("72000 watts", electricCar.getBattery());
    }
}
