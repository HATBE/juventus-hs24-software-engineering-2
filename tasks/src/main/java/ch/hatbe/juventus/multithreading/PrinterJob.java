package ch.hatbe.juventus.multithreading;

public class PrinterJob implements Runnable {
    private Printer printer;

    public PrinterJob(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        this.printer.print();
    }
}
