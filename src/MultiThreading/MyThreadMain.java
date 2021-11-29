package MultiThreading;

public class MyThreadMain {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();    // default constructor of thread class
        thread1.setName("MyThread_1");
        thread1.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
            try {
                Thread.sleep(850);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of Application !! ");


        MyThread thread2 = new MyThread();
        thread2.setName("MyThread_2");
        thread2.start();

        MyThread thread3 = new MyThread();
        thread3.start();

        MyThread thread4 = new MyThread("MyThread_3");   //parametrized constructor for setting name to thread
        thread4.start();
    }
}
