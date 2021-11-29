package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(new Integer(13),"Vaibhav");
        map1.put(12,"G1");
        map1.put(16,"Akshay");
        map1.put(new Integer(14),"Deepak");
        map1.put(new Integer(14),"Akshay");  // As 14 is present as key in map, value will be replaced with new one.
        // null key and value is allowed in hashMap.

        System.out.println("1st Map : " + map1);
        // get all keys
        Set<Integer> keys = map1.keySet();
//        System.out.println(keys);
        Iterator<Integer> itr1 = keys.iterator();
        while (itr1.hasNext()){
            Integer key = itr1.next();
            System.out.println(key + " : " + map1.get(key));
        }


        // New hasmap of type Employe
        HashMap<Employee,String> map2 = new HashMap<>();
        map2.put(new Employee(139,"Sanket",1298),"Manager");
        map2.put(new Employee(181,"Tommy",7800),"Clerk");
        map2.put(new Employee(13,"Hilfigher",8200),"Officer");
        map2.put(new Employee(272,"Virat",8000),"Consultant");
        map2.put(new Employee(837,"Rohit",7500),"Executive");
        map2.put(new Employee(13,"Hilfigher",8200),"HR") ;

        Set<Employee> keySet = map2.keySet();
        Iterator<Employee> itr2 = keySet.iterator();

        while (itr2.hasNext()){
            Employee em = itr2.next();
            System.out.println("Emp id : "+ em.getId() + ". Emp Name : "+ em.getName()  + ". Emp Salary :  "+ em.getSalary() + ". Designation : " + map2.get(em));
        }

    }
}
