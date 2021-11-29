package MyPack;

public class Parent {
    private String msg;
    public Parent(){
        System.out.println("Parent Default Constructor ");

    }
    public Parent(String msg)
    {
        this.msg = msg;
        System.out.println("Inside Parent Parametrized Constructor " + this.msg);
    }
}
