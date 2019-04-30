package CarPackage;

import CarsType.CarsType;
import Engine.CarEngine;
import Engine.MotorEngine;
import ExternalProperties.ExternalProperties;
import InternalProperties.InternalProperties;
import Prices.Price;
import Wheels.CarWheel;
import Wheels.MotorCycleWheels;

import java.util.Scanner;

public abstract class Car {
    private CarModel model;
    public Price price = new Price();
    public CarsType carstype = null;
    public CarEngine enginetype = null;
    public MotorEngine motorenginetype = null;
    public CarWheel wheeltype = null;
    public MotorCycleWheels motorwheeltype = null;
    public InternalProperties internalitems = null;
    public ExternalProperties externalitems = null;
    public Scanner sc = new Scanner(System.in);

    public Car(CarModel model) {

        this.model = model;
    }


    public CarModel getModel() {

        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    protected abstract void construct();

    protected abstract void buildCar();

    protected abstract void carType();

    protected abstract void buildEngine();

    protected abstract void buildWheels();

    protected abstract void addInternalItems();

    protected abstract void addExternalItems();

}
