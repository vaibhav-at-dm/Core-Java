package collection;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Integer(44));
        set.add(new Integer(29));
        set.add(new Student(13,"Vaibhav", (float) 34.9));
        set.add(54.67);
        set.add("Akshay");
        set.add(29);
        set.add(55);
        set.add(new Student(55,"Ronit",(float) 89.99));
        set.add(new Float(334.455));
        set.add(new Student(55,"Ronit",(float) 89.99));
        set.add(54.67);    // set is unique collection. Duplicates will not be added.
        set.add(29);
        set.add(55);

        System.out.println("Size of Set is " + set.size());

        //to get elements from set we need to use iterator.
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
