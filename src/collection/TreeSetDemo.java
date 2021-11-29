package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(50);
        set.add(30);
        set.add((int) 10.345);
//        set.add(10.45);     // cant compare two different types of objects
        // To avoid this in collection (classcastexception) we have generic . Generic is type Safe Collection.
        // Syntax:
        // ArrayList<Type> list = new ArrayList<Type>();
        set.add(new Integer(40));
        set.add(20);

        System.out.println("1st TreeSet : ");
        System.out.println(set);
//        Iterator itr = set.iterator();

        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Hello");
        set1.add("Hi");
        set1.add("Welcome");
        set1.add("heelloo");
        set1.add("Good");
        System.out.println(set1);  // small letters has less unicode value. Sorting on basis of unicode.

        TreeSet<Product> set2 = new TreeSet<>(new ProductCompartor());  // Due to this sorting will be based on PId. See ProductComparator Class. Comparator is implemented.
        set2.add(new Product(34,"KeyBoard",1599));
        set2.add(new Product(35,"Laptop",55000));
        set2.add(new Product(36,"Mouse",299));
        set2.add(new Product(37,"IPad",49999));
        set2.add(new Product(38,"Phone",15990));
        System.out.println("1st Product Set");
        Iterator<Product> it = set2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------------------------------");

        TreeSet<Product> set3 = new TreeSet<>();                // sorting on basis of product Name (see Product Class) (compareTo is overridden)
        set3.add(new Product(34,"KeyBoard",1599));
        set3.add(new Product(35,"Laptop",55000));
        set3.add(new Product(36,"Mouse",299));
        set3.add(new Product(37,"IPad",49999));
        set3.add(new Product(38,"Phone",15990));
        System.out.println("1st Product Set");
        Iterator<Product> it1 = set3.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
