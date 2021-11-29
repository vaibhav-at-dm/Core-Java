package MyPack;

public class Calculator {                  //Method OverLoading (Compile time polymorphism)
    // Same name different signature. Differentiate on basis of argument passed only.
    void add(int x,int y)
    {
        System.out.println("Result of addition of 2 nums is " + (x+y));
    }
    int add(int x , int y , int z)
    {
        return x+y+z;
    }
    void add(int a , float b){
        System.out.println("Result of addition of 2 nums is " + (a+b));
    }
    float add (float x, int y)
    {
        return x+y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(2,3);
        System.out.println(cal.add((float) 2.4,4));
        System.out.println(cal.add(1,4,5));


    }
}
