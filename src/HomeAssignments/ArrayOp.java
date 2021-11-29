package HomeAssignments;

public class ArrayOp {
    public static void main(String[] args) {
        int arr[];
        arr = new int[]{3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
//        System.out.println(arr.length);
        int sumi = 0;
        int avg;
        int mini = arr[0];
        for (int i = 0; i < 15; i++) {
            sumi += arr[i];
            mini = Math.min(mini, arr[i]);
        }
        avg = sumi / 15;
        arr[15] = sumi;
        arr[16] = (int) avg;
        arr[17] = mini;

        for (int i : arr
             ) {
            System.out.print(i + " ");
        }

    }
}
