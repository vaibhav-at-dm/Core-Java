package MultiThreading;

public class MyRunnable implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ " from "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // milliseconds passed. will be stopped for 1000 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
