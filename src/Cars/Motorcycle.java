package Cars;

import CarPackage.Car;
import CarPackage.CarModel;
import Engine.MotorEngine;
import ExternalProperties.ExternalProperties;
import InternalProperties.InternalProperties;
import Wheels.MotorCycleWheels;

public class Motorcycle extends Car {

    private String color;
    private String year;

    public Motorcycle() {
        super(CarModel.MOTORCYCLE);
        price.carModelCost(CarModel.MOTORCYCLE);
        construct();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    protected void construct() {
        buildCar();
        buildEngine();
        buildWheels();
        addInternalItems();
        addExternalItems();
        System.out.println(price.getCost());
    }

    @Override
    protected void buildCar() {
        System.out.println("please Enter car color");
        String colorCar = sc.nextLine();
        setColor(colorCar);
        System.out.println("please Enter car Year");
        String yearCar = sc.nextLine();
        setYear(yearCar);
        price.carCost(colorCar, year);

    }

    @Override
    protected void carType() {

    }

    @Override
    protected void buildEngine() {
        motorenginetype = new MotorEngine();
        price.motorEngineCost(motorenginetype.getEngineModel());
    }

    @Override
    protected void buildWheels() {
        motorwheeltype = new MotorCycleWheels();
        price.motorWheelCost(motorwheeltype.getWheelModel());

    }

    @Override
    protected void addInternalItems() {
        internalitems = new InternalProperties();
        price.internalItemsCost(internalitems.getItem());

    }

    @Override
    protected void addExternalItems() {
        externalitems = new ExternalProperties();
        price.externalItemsCost(externalitems.getItem());

    }

    @Override
    public String toString() {
        return "Vehical : MotorCYCLE " + "\n" +
                "color: " + color + "\n" +
                "year: " + year + "\n" +
                motorenginetype + "\n" +
                motorwheeltype + "\n" +
                internalitems + "\n" +
                externalitems + "\n" +
                "Total Cost : " + price.getCost() + "$";
    }
}
