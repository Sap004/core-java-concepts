package src.InterfaceAndAbstractClass;

public class Light implements Switch{

    @Override
    public void turnOff() {
        System.out.println("Light is Off now. Enjoy Dark Mode");
    }

    public void getBill() {

    }

    public void turnOn(){
        System.out.println("Let there be light");
    }
}
