package MultiThreading;

public class SharedResourceMain {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        SetterThread setter = new SetterThread(sharedResource);
        GetterThread getter = new GetterThread(sharedResource);

        Thread setterThread = new Thread(setter);
        Thread getterThread = new Thread(getter);

        setterThread.start();
        getterThread.start();

        try {
            setterThread.join();
            getterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
