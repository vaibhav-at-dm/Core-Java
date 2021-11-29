package MultiThreading;

public class GetterThread implements Runnable{
    private SharedResource sharedResource;

    public GetterThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                sharedResource.getNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
