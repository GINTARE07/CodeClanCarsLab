import org.junit.Before;
import org.junit.Test;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;


    @Before
    public void before (){
        petrolCar = new PetrolCar(52_000, "Toyota", "Petrol", "Catalytic Converters");
    }
    @Test
    public void hasPrice(){
        assertEquals(52_000, petrolCar.getPrice(),0.00);
    }
    @Test
    public void hasMake(){
        assertEquals("Toyota", petrolCar.getMake());
    }
    @Test
    public void hasEngineType(){
        assertEquals("Petrol", petrolCar.getEngine());
    }
    @Test
    public void hasConvertor(){
        assertEquals("Catalytic Converters", petrolCar.getConverter());
    }
}

