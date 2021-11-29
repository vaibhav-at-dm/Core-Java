package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {    // only difference between arraylist and vector is threadSafety. Vector is threadSafe.
        Vector vector = new Vector();    // Legacy Class
        vector.addElement(10);    // vector specific which has threadSafety
        vector.addElement("twenty");
        vector.addElement(123.543);
        vector.addElement("Hi");
        vector.addElement("Hello");
        vector.addElement("twenty");
        vector.addElement("Thirty 30");

        System.out.println("Size of vecor is " + vector.size());

        Enumeration em = vector.elements();    // To achieve threadSafety while getting the elements of vector we are using enumeration

        while (em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
    }
}
