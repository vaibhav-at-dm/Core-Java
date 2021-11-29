package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Integer(10));
        list.add(new Float(21.45));
        list.add(new String("Hello Hi"));
        list.add(20);   // from jdk5 , autoboxing is introduced
        list.add(322.45);
        list.add("Hi");
        list.add(20);
        list.add("Hey ");
        list.add(new Student(12,"Vaibhav", (float) 89.23));
        list.add(new Student(14,"Akshay", (float) 99.99));
        list.add(43.5);
        list.add(2,"Welcome");

        System.out.println("Size of ArrayList is " + list.size());

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Student){
                System.out.println();
                System.out.println("Roll No : " + ((Student) obj).getRollNo());
                System.out.println("Name : " + ((Student) obj).getName());
                System.out.println("Percentage : " + ((Student) obj).getPercentage());
//                System.out.println();
            }else{
            System.out.println("Index " + i + " : " + obj);}
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>(); // generic for avoiding classcastexception. This is type safe collection.
        list1.add(65);
        list1.add((int) 322.565);
        list1.add(89);
        System.out.println("Integer List ");
        System.out.println(list1);   // only integers will be there in this collection.
    }
}
