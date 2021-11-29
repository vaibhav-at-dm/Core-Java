package MultiThreading;

public class SetterThread implements Runnable{
    private SharedResource sharedResource;

    public SetterThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            try {
                sharedResource.setNumber(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
