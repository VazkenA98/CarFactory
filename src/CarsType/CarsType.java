package CarsType;

import java.util.Scanner;

public class CarsType {
    private CarType carType;
    private Scanner sc = new Scanner(System.in);

    public CarsType() {
        carsSecondaryTypes();
        setCarSecondaryType();

    }
    public void carsSecondaryTypes(){
        for(CarType s : CarType.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
    public void setCarSecondaryType(){
        System.out.println("please enter Car secondary type");
        String type = sc.nextLine();
        String carsType = type.toUpperCase();
        this.carType = (CarType.valueOf(carsType));

    }
    public CarType getCarSecondaryType(){
        return carType;
    }

    @Override
    public String toString() {
        return "Car Type :"+ carType;

    }
}
