package collection;

public class Product implements Comparable{  // compareTo has abstract methode compareTo
    private int id;
    private String pname;
    private float price;

    public Product(int id, String pname, float price) {
        this.id = id;
        this.pname = pname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "Product ID : " + id + " name : " + pname + " Price : " + price;
    }
    public int compareTo(Object o ){
//        if (o instanceof Product){    comparing on basis of id
//            Product p = (Product) o;
//            if (this.id > p.id){
//                return 1;
//            }
//            else if (this.id < p.id) {
//                return -1;
//            }
//        }
        if (o instanceof Product){                // comparing on basis of PName
            Product p = (Product) o;
            return this.pname.compareTo(p.pname);
        }
        return 0;
    }
}
