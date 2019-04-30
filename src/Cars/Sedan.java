package Cars;

import CarPackage.Car;
import CarPackage.CarModel;
import CarsType.CarsType;
import Engine.CarEngine;
import ExternalProperties.ExternalProperties;
import InternalProperties.InternalProperties;
import Wheels.CarWheel;

public class Sedan extends Car {
    private String color;
    private String year;

    public Sedan() {
        super(CarModel.SEDAN);
        price.carModelCost(CarModel.SEDAN);
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
        carType();
        buildEngine();
        buildWheels();
        addInternalItems();
        addExternalItems();
        // System.out.println(p.getCost());
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
        carstype = new CarsType();
        price.carTypeCost(carstype.getCarSecondaryType());

    }

    @Override
    protected void buildEngine() {
        enginetype = new CarEngine();
        price.carEngineCost(enginetype.getEngineModel());
    }

    @Override
    protected void buildWheels() {
        wheeltype = new CarWheel();
        price.carWheelCost(wheeltype.getWheelModel());

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
        return "Car : Sedan " + "\n" +
                carstype + "\n" +
                "color: " + color + "\n" +
                "year: " + year + "\n" +
                enginetype + "\n" +
                wheeltype + "\n" +
                internalitems + "\n" +
                externalitems + "\n" +
                "Total Cost : " + price.getCost() + "$";
    }

}
