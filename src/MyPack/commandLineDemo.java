package MyPack;

public class commandLineDemo {
    public static void main(String[] args) {
        System.out.println("Command Line Demo  ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
