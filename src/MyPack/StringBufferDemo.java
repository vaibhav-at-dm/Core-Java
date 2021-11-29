package MyPack;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hi");

        System.out.println("sb1 " + sb1);
        System.out.println("sb2 " + sb2);

        sb1.append(sb2);
        System.out.println("sb1 is " + sb1);

        sb1.delete(5,7);
        System.out.println("Sb1 is " + sb1);

        sb1.replace(0,5,"Welcome");    // not includes last index
        System.out.println("Sb1 is " + sb1);


    }
}
