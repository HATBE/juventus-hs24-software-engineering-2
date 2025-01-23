package ch.hatbe.juventus.multithreading;

public class ThreadInfoExample {
    public static void main(String[] args) {
        Runnable r = new ThreadInfo();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.start();
        t2.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
