package MyPack;

public class SuperClass {
    void display()
    {
        System.out.println("Display() from super class !! ");

    }
    public SuperClass getObject(){
        return new SuperClass();
    } // lets override this in subclass

}
