package src;

import src.HashCodeEqualsContract.Student;
import src.Inheritance.Car;
import src.Inheritance.Vehicle;
import src.InterfaceAndAbstractClass.Light;
import src.InterfaceAndAbstractClass.Switch;
import src.MultiThreading.MultiThreadingExtendingThreadClass;
import src.MultiThreading.MultiThreadingImplementingRunnableInterface;
import src.java8.OptionalClass;

import static src.DemoConstants.DemoConstants.*;

public class Main {
    public static void main(String ... args) {

        if(demoMultiThreading){
            System.out.println("Hello world!");
            System.out.println("Inside Main!");
            MultiThreadingExtendingThreadClass T1=new MultiThreadingExtendingThreadClass();
            Thread T2 = new Thread(new MultiThreadingImplementingRunnableInterface());
            T1.start();
            T2.start();
        }

        if(demoInheritance){
            Vehicle vehicle=new Car();
            vehicle.start();
            Light tubeLight=new Light();
            Switch.stateVoltageRating();
            tubeLight.turnOn();
            tubeLight.turnOff();
        }



        if(demoHashCodeEquals){
            Student student1=new Student(1,"ABC");
            Student student2=new Student(1,"ABC");

            System.out.println(student1==student2);
            System.out.println(student1.equals(student2));

            System.out.println("Student1 hashCode ="+ student1.hashCode());
            System.out.println("Student1 hashCode ="+ student2.hashCode());

        }

        if(demoOptional){
            OptionalClass op=new OptionalClass();
            op.doIt();
        }
    }
}