package ch.hatbe.juventus.recursion;

public class Fibonacci {
    private static int fib1(int n) {
        int fib = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }

    private static int fib2(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib2(n - 2) + fib2(n - 1);
        }
    }

    public static void main(String[] args) {
        long ms1 = System.nanoTime();
        System.out.println(fib1(40));
        System.out.println((System.nanoTime() - ms1) + "ns");

        long ms2 = System.nanoTime();
        System.out.println(fib1(40));
        System.out.println((System.nanoTime() - ms2) + "ns");




    }
}
