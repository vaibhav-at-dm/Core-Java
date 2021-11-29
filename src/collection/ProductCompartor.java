package collection;

import java.util.Comparator;

public class ProductCompartor implements Comparator<Product> {   // <Product> making it type safe
//    public int compare(Object o1,Object o2){   // this will work for only Comparator here we are making it TypeSafe by doing Comparator<Product>
//        if (o1 instanceof Product && o2 instanceof Product){
//            Product p1 = (Product) o1;
//            Product p2 = (Product) o2;
//            return p1.getId() - p2.getId();    // if p1 id is greater positive value will be returned . If p2 id is greater -ve value will be returned. If same 0 will be returned.
//        }
//        return 0;
//    }

    // due to Comparator<Product>
    // code reduces to
    public int compare(Product p1,Product p2){
        return p1.getId() - p2.getId();
    }
}
