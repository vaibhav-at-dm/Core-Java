package MyPack;

public class ArrayDemo {
    public static void main(String arg[])
    {
        int arr1[] = new int[3];
        arr1 = new int[]{10,20,30};
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[2] = 30;

        for (int i = 0;i< arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

        int arr2[] = {1,2,3,4,5,6,7};
        for (int i: arr2
             ) {
            System.out.println(i);
        }


        // 2D array

        int[][] arr3 = new int[2][3];    // [][] can be anywhere.... eg. int []arr3[] or int arr3[][]
        // rows must be specified
        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[1][0] = 4;
        arr3[1][1] = 5;
        arr3[1][2] = 6;


        System.out.println();

        for (int i = 0;i< arr3.length;i++)           // gives length of rows
        {
            for (int j = 0;j< arr3[i].length;j++)     //gives length of columns
            {
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
