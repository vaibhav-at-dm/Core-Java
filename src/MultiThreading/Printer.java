package MultiThreading;

public class Printer {
    public void print(String msg) throws InterruptedException {  // or ---> synchronized public void print(String msg) throws InterruptedException. Complete method will be synchronized
        synchronized (this){           // this will synchronize only this much block
            System.out.print("[ " + msg);
            Thread.sleep(800);
            System.out.println(" ]");
        }
    }
}
