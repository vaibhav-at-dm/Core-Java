package MultiThreading;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        PrinterThread thread1 = new PrinterThread(printer,"Hello");
        PrinterThread thread2 = new PrinterThread(printer,"Hi");
        PrinterThread thread3 = new PrinterThread(printer,"Welcome");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Main Thread ! ");
    }
}
