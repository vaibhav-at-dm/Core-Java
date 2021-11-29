package Map;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Pid : " + id + " Name : " + name + " Price " + price;
    }

    @Override
    public int compareTo(Product p) {   // comparing product object on basis of price.
        if (this.price > p.price){
            return 1;
        }
        else if (this.price < p.price){
            return -1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }
}
