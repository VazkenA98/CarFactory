package Engine;

import java.util.Scanner;

public class MotorEngine {
    private MotorEngineType engineModel;
    private Scanner sc = new Scanner(System.in);

    public MotorEngine() {
        engineTypes();
        setEngineModel();

    }
    public void engineTypes(){
        for(MotorEngineType s : MotorEngineType.values())
            System.out.println(s.ordinal()+1 + " - " + s);
    }
    public void setEngineModel(){
        System.out.println("please enter Engine types");
        String engine = sc.nextLine();
        String vehicaleEngine = engine.toUpperCase();
        this.engineModel = (MotorEngineType.valueOf(vehicaleEngine));

    }
    public MotorEngineType getEngineModel(){
        return engineModel;
    }


    @Override
    public String toString() {
        return "Engine Model : " + engineModel;
    }
}
