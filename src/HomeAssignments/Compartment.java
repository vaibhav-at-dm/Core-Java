package HomeAssignments;

import java.util.Random;

abstract public class Compartment {
    abstract public void notice();
}

class FirstClass extends  Compartment{
    public void notice(){
        System.out.println("This is FirstClass Compartment");
    }
}

class Ladies extends  Compartment{
    public void notice(){
        System.out.println("This is Ladies Compartment");
    }
}

class General extends  Compartment{
    public void notice(){
        System.out.println("This is General Compartment");
    }
}

class Luggage extends Compartment{
    public void notice(){
        System.out.println("This is Luggage Compartment");
    }
}

class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        Random random = new Random();

        for (Compartment comp: c
             ) {
            int num = random.nextInt(3);
            System.out.println("-----------------");
            if (num == 0) {
                comp = new FirstClass();
            }
            else if (num == 1) {
                comp = new Ladies();
            }
            else if (num == 2) {
                comp = new General();
            }
            else if (num == 3) {
                comp = new Luggage();
            }

            comp.notice();
        }
    }
}