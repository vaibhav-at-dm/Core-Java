package inner_classes;

public class AnonymousDemo {
    public static void main(String[] args) {
        Demo d = new Demo() {
            @Override
            public void display() {
                System.out.println("display() from demo ");
            }
        };
        Test t  = new Test() {
            @Override
            public void show(String msg) {
                System.out.println("show with parameter : " + msg);
            }
        };
        t.show("Hii");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }

}
