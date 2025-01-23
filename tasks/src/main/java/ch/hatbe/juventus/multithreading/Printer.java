package ch.hatbe.juventus.multithreading;

public  class Printer {
    public synchronized void print() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}