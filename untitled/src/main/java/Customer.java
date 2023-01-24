import behaviours.IOwn;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;

public class Customer {

    private double money;

    private ArrayList<IOwn> cars;

    public Customer(double money){
        this.money = money;
        this.cars = new ArrayList<IOwn>();

    }

    public double getMoney() {
        return money;
    }

    public ArrayList<IOwn> getCars() {
        return cars;
    }

    public int countVehicles(){
        return this.cars.size();
    }

    public void addVehicle(IOwn car){
        this.cars.add(car);
    }
}
