package src;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Inside Main!");
        MultiThreadingExtendingThreadClass T1=new MultiThreadingExtendingThreadClass();
        Thread T2 = new Thread(new MultiThreadingImplementingRunnableInterface());
        T1.start();
        T2.start();

    }
}