package ch.hatbe.juventus.multithreading;

public class ThreadInfo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
