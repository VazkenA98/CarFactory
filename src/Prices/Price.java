package Prices;

import CarPackage.CarModel;

import CarsType.CarType;

import Engine.CarEngineType;

import Engine.MotorEngineType;
import ExternalProperties.ExternalItems;
import InternalProperties.InternalItems;
import Wheels.CarWheelTypes;
import Wheels.MotorWheelsType;

public class Price {
    private int cost = 0;

    public Price() {
    }

    public void carModelCost(CarModel model) {
        switch (model) {
            case SEDAN:
                cost += 1000;
                break;
            case CROSSOVER:
                cost += 1200;
                break;
            case HATCHBACK:
                cost += 1000;
                break;
            case TRUCK:
                cost += 2500;
                break;
            case TRACTOR:
                cost += 500;
                break;
            case MOTORCYCLE:
                cost += 700;
                break;
            default:
                // throw some exception
                break;

        }
    }

    public void carCost(String color, String year) {
        if (color == "gold") {
            cost += 400;
        } else {
            cost += 300;
        }
        if (Integer.parseInt(year) < 2000) {
            cost += 1000;
        } else if (Integer.parseInt(year) >= 2000 && Integer.parseInt(year) < 2010) {
            cost += 1500;
        } else {
            cost += 3000;
        }
    }

    public void carEngineCost(CarEngineType type) {
        switch (type) {
            case ELECTRICAL:
                cost += 850;
                break;
            case DIESEL:
                cost += 500;
                break;
            case PETROL:
                cost += 450;
                break;
            case HYBRID:
                cost += 980;
                break;

            default:
                // throw some exception
                break;
        }
    }

    public void motorEngineCost(MotorEngineType type) {
        switch (type) {
            case ELECTRICAL:
                cost += 850;
                break;
            case PETROL:
                cost += 450;
                break;

            default:
                // throw some exception
                break;
        }
    }

    public void carTypeCost(CarType type) {
        switch (type) {
            case BUISNESS:
                cost += 1850;
                break;
            case SPORT:
                cost += 1500;
                break;
            case LUXURY:
                cost += 2550;
                break;
            default:
                // throw some exception
                break;
        }
    }

    public void carWheelCost(CarWheelTypes type) {
        switch (type) {
            case FOURWHEEL:
                cost += 750;
                break;
            case FRONTWHEEL:
                cost += 600;
                break;
            case BACKWHEEL:
                cost += 250;
                break;
            default:
                // throw some exception
                break;
        }
    }

    public void motorWheelCost(MotorWheelsType type) {
        switch (type) {
            case TWOWHEELS:
                cost += 850;
                break;
            case THREEWHEELS:
                cost += 600;
                break;
            default:
                // throw some exception
                break;
        }
    }

    public void internalItemsCost(InternalItems item) {
        switch (item) {
            case CUPHOLDER:
                cost += 150;
                break;
            case BLINDSPOTMIRROR:
                cost += 200;
                break;
            case PHONEHOLDER:
                cost += 100;
                break;
            default:
                // throw some exception
                break;
        }
    }

    public void externalItemsCost(ExternalItems item) {
        switch (item) {
            case CAMERAS:
                cost += 450;
                break;
            case SENSORS:
                cost += 200;
                break;
            case SPOTLIGHTS:
                cost += 275;
                break;
            default:
                // throw some exception
                break;
        }
    }

    public int getCost() {
        return cost;
    }
}
