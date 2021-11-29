package HomeAssignments;

import java.util.Locale;

public class StringFromCMD {
    public static void main(String[] args) {
        String st = "";
        System.out.println(args[0].toString());
        for (String i:args
             ) {
            st = st.concat(i);
        }

        StringBuffer sb = new StringBuffer(st);
        System.out.println("String is " + st);
        System.out.println("Length is " + st.length());
        System.out.println("Uppercase is " + st.toUpperCase());
        sb.reverse();
        String rev = sb.toString();
        if (rev.equals(st)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");

        }
    }
}
