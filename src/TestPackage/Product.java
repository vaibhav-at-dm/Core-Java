package TestPackage;

public class Product implements Cloneable{      // cloneable is marker interface. Has no method written in it.
    private int id;
    private String name;
    private float price;


    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    public int hashCode()
    {
        return this.id;
    }
    public String toString()       // This method is object class of java which we are overriding here according to our purpose.
    {
        return " Id : " + this.id + " Name : " + this.name + " Price : " + this.price;
    }
    public boolean equals(Object obj)
    {
        Product p = (Product) obj;             //casted into product
        if  (this.id == p.id && this.name.equals(p.name)  && this.price == p.price)
        {
            return true;
        }
        return false;

    }
    // While overr
//    public static void main(String[] args) throws CloneNotSupportedException{
//        Product p1 = new Product(1001,"Charger",499);
//        System.out.println("p1 is " + p1);
//
//        Product p2 = (Product) p1.clone();
//
//        System.out.println("p2 after cloning p1 is  " + p2);
//    }
    public Object clone(){
        return this;
    }

}
