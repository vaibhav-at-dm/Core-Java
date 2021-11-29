package MultiThreading;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.setName("MyRunnable_1");
        thread1.start();


        Thread thread2 = new Thread(runnable,"MyRunnable_2");
        thread2.start();
        // on one thread object , start() can be called only once
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
        }
        try {
            thread1.join();       //thread1 joins main thread. Main thread will not go ahead until thread1 finish its execution.
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Application ! ");
    }
}
