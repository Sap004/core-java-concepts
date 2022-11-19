package src;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Inside Main!");
        MultiThreadingExtendingThreadClass T1=new MultiThreadingExtendingThreadClass();
        MultiThreadingImplementingRunnableInterface T2=new MultiThreadingImplementingRunnableInterface();
        T1.run();
        T2.run();

    }
}