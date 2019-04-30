package Engine;

import java.util.Scanner;

// enum EngineType {
//    ELECTRICAL, DIESEL, PETROL, HYBRID;
//}
public class CarEngine {
    private CarEngineType engineModel;
    private Scanner sc = new Scanner(System.in);

    public CarEngine() {
        engineTypes();
        setEngineModel();

    }
    public void engineTypes(){
        for(CarEngineType s : CarEngineType.values())
            System.out.println(s.ordinal()+1 + " - " + s);
    }
    public void setEngineModel(){
        System.out.println("please enter Engine types");
        String engine = sc.nextLine();
        String vehicaleEngine = engine.toUpperCase();
        this.engineModel = (CarEngineType.valueOf(vehicaleEngine));

    }
    public CarEngineType getEngineModel(){
        return engineModel;
    }


    @Override
    public String toString() {
        return "Engine Model : " + engineModel;
    }

}
