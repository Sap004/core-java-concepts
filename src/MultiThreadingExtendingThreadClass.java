package src;

public class MultiThreadingExtendingThreadClass extends Thread {

    /** Here we demonstrate a technique to implement multi threading by extending the thread class*/
    @Override
    public void run() {
        super.run();
        System.out.println("Inside Run : Extending Thread Class");
    }
}
