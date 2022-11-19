package src;

public class MultiThreadingImplementingRunnableInterface implements Runnable {
    /** Here we demonstrate a technique to implement multithreading by implementing runnable interface*/

    @Override
    public void run() {
        System.out.print("Inside run: implementing runnable interface");
    }
}
