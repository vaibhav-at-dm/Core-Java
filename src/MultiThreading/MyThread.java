package MultiThreading;

public class MyThread extends Thread{
//    private String name;
    public MyThread(String msg){
        super(msg);
    }
    public MyThread(){
    }
    public void run(){

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " from " + getName());
        }
    }
}
