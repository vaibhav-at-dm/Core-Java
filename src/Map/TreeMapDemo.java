package Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("Hii",9);
        treeMap1.put("hii",89);
        treeMap1.put(new String("Bye"),67);
        treeMap1.put("Hii",20);
        treeMap1.put("Welcome",7432);
        // Sorted on basis of key.  here on basis of String. Capital letters has less unicode than small letters
        System.out.println("Map 1 ");
        System.out.println(treeMap1);

        TreeMap<Integer,String> treeMap2 = new TreeMap<>();
        treeMap2.put(50,"Bye");
        treeMap2.put(123,"But");
        treeMap2.put(837,"Keep Calm");
        treeMap2.put(123,"Stay Chill"); // "But" will be replaced with "Stay Chill"
        treeMap2.put(13,"DataMetica");
        // here sorting on basis of integer.
        System.out.println("Map 2");
        System.out.println(treeMap2);

        // map3 of type product,string
        TreeMap<Product,String> treeMap3 = new TreeMap<>();   // sorting on basis of price using Comparable(compareTo)
        treeMap3.put(new Product(37,"Laptop",35999),"Electronics");
        treeMap3.put(new Product(8908,"Shirt",788),"Fashion");
        treeMap3.put(new Product(8456,"Trimmer",549),"Grooming");
        treeMap3.put(new Product(251,"Dolo 650",49),"Medical");
        treeMap3.put(new Product(122,"KeyBoard",1450),"Electronics");

        Set<Product> keysT3 = treeMap3.keySet();
        Iterator<Product> itr = keysT3.iterator();
        // Product Object cant  be compared so we need to write Comparable.
        System.out.println("Map 3 sorted on price");
        while (itr.hasNext()){
            Product p = itr.next();
            System.out.println(p + "  " + treeMap3.get(p));
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Map 4 sorted on Name"); // using ProductComparator
        TreeMap<Product,String> treeMap4 = new TreeMap<>(new ProductComparator());    // Now Comparing on basis of Product Name
        treeMap4.put(new Product(37,"Laptop",35999),"Electronics");
        treeMap4.put(new Product(8908,"Shirt",788),"Fashion");
        treeMap4.put(new Product(8456,"Trimmer",549),"Grooming");
        treeMap4.put(new Product(251,"Dolo 650",49),"Medical");
        treeMap4.put(new Product(122,"KeyBoard",1450),"Electronics");

        Set<Product> keysT4 = treeMap4.keySet();
        Iterator<Product> itr1 = keysT4.iterator();
        // Product Object cant  be compared so we need to write Comparable.
        while (itr1.hasNext()){
            Product p = itr1.next();
            System.out.println(p + "  " + treeMap4.get(p));
        }
    }
}
