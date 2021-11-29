package Map;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,Integer> table = new Hashtable<>();
        table.put("Hello",10);
        table.put("Hiii",12);
        table.put("welcome",13);
        table.put("Null",14);
        table.put("Hello",9);   // Value will be replaced with new one as key "Hello" is already present
        table.put("HAshTable",18);
        // table.put(null,45);   null can't be present in hashTable as key or value. and HAshTable is ThreadSafe . This is only difference between hashTable and HashMap
        table.put("Bye",new Integer(26));

        System.out.println(table);
    }
}
