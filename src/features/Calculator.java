package features;

public class Calculator {
    int add(int a, int b , int... c){
        int res = a + b;
        for (int r : c
             ) {
            res += r;
        }
        return res;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int sum = obj.add(1,2,3,44,5,6,2,2,5,6,7,0); // or obj.add(1,2) or obj.add(1,2,any number of integer args)
        System.out.println(sum);
    }
}
