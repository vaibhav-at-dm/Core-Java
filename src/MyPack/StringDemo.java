package MyPack;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        System.out.println("s1 " + s1);
        String s2 = new String("Hi");
        System.out.println("s2 " + s2);

        System.out.println("s1 compareTo s2 : " + s1.compareTo(s2));

        System.out.println("char at 2nd index in s1 " + s1.charAt(2));

        String s3 = new String("hello");
        System.out.println("Result of s3 compareTo s1 " + s3.compareTo(s1));

        s2.concat(" Welcome");
        System.out.println("s2 will be  " + s2);  // no change becuase you have to store it

        s2 = s2.concat(" Welcome");
        System.out.println("s2 after assigning back : "+ s2);

        System.out.println("s1 equals s3 : " + s1.equals(s3));
        System.out.println("s1 equalsignorecase s3 " + s1.equalsIgnoreCase(s3));


        String s5 = "Hello";
        System.out.println("s1 equals s5 " + s1.equals(s5));
        System.out.println("s1 equals s5 " + s1==s5);
        String s7 = "Hello";
        System.out.println("s7 equals s5 " + (s7==s5));



    }
}
