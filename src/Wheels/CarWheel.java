package Wheels;

import java.util.Scanner;

public class CarWheel {

    private CarWheelTypes wheelTypes;
    private Scanner sc = new Scanner(System.in);

    public CarWheel() {
        wheelTypes();
        setWheelModel();
    }

    public void wheelTypes() {
        for (CarWheelTypes s : CarWheelTypes.values())
            System.out.println(s.ordinal() + 1 + " - " + s);
    }

    public void setWheelModel() {
        System.out.println("please enter Wheel types");
        String type = sc.nextLine();
        String wheelsType = type.toUpperCase();
        this.wheelTypes = (CarWheelTypes.valueOf(wheelsType));

    }

    public CarWheelTypes getWheelModel() {

        return wheelTypes;
    }

    @Override
    public String toString() {
        return "Wheels Types : " + wheelTypes;
    }
}
