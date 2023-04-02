package src.InterfaceAndAbstractClass;

@FunctionalInterface
public interface Switch {

    public default void turnOn(){
        System.out.println("Device Turned On");
    }

    public static void stateVoltageRating(){
        System.out.println("Operates on 220V");
    }

    public void turnOff();


}
