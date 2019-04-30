package CarFactory;

import CarPackage.Car;
import CarPackage.CarModel;
import Cars.*;
import java.util.Scanner;

public class CarFactory {
    Scanner sc = new Scanner(System.in);
    private CarModel model;

    public CarFactory() {
        carTypes();
        setCarType();
    }

    public void setCarType(){
        System.out.println("please enter car types");
        String type = sc.nextLine();
        String vehicaleType = type.toUpperCase();
        this.model = CarModel.valueOf(vehicaleType);
    }

    public void carTypes(){
        for(CarModel s : CarModel.values())
            System.out.println(s.ordinal()+1 + " - " + s);
    }

    public Car buildCar() {
        Car car = null;
        switch (this.model) {
            case SEDAN:
                car = new Sedan();
                break;
            case CROSSOVER:
                car = new Crossover();
                break;
            case HATCHBACK:
                car = new Hatchback();
                break;
            case TRUCK:
                car = new Truck();
                break;
            case TRACTOR:
                car = new Tractor();
                break;
            case MOTORCYCLE:
                car = new Motorcycle();
                break;
            default:
                // throw some exception
                break;
        }
        return car;

    }

}

