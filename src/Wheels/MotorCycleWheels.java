package Wheels;

import java.util.Scanner;

public class MotorCycleWheels {

    private MotorWheelsType wheelTypes;
    private Scanner sc = new Scanner(System.in);

    public MotorCycleWheels() {
        wheelTypes();
        setWheelModel();
    }

    public void wheelTypes() {
        for (MotorWheelsType s : MotorWheelsType.values())
            System.out.println(s.ordinal() + 1 + " - " + s);
    }

    public void setWheelModel() {
        System.out.println("please enter Wheel types");
        String type = sc.nextLine();
        String wheelsType = type.toUpperCase();
        this.wheelTypes = (MotorWheelsType.valueOf(wheelsType));

    }

    public MotorWheelsType getWheelModel() {
        return wheelTypes;
    }

    @Override
    public String toString() {
        return "Wheels Types : " + wheelTypes;
    }
}
