package HomeAssignments;

public class Prob5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int arr[] = new int[5];
        arr = new int[]{2,34,19,23,10};
        int flag = 0;
        for (int i : arr
             ) {
            if (i == a){
                flag = 1;
            }
        }
        if (flag == 1){
            for (int i : arr
            ) {
                if (i == b){
                    flag = 2;
                }
            }
            if (flag == 2)
            {
                System.out.println("Its Bingo !");
            }
            else {
                System.out.println("Not Found !");
            }
        }
        else {
            System.out.println("Not Found !");
        }


    }
}
