package HomeAssignments;

import MyPack.Product;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] arr = new Rectangle[4];

        arr[0] = new Rectangle();
        arr[1] = new Rectangle();
        arr[2] = new Rectangle();
        arr[3] = new Rectangle(3,5);

        arr[0].setLength((float) 12.2);
        arr[0].setBreadth((float) 10);

        arr[1].setLength((float) 2.14);
        arr[1].setBreadth((float) 5.21);

        arr[2].setLength((float) 7.0);
        arr[2].setBreadth((float) 5.0);

        for (Rectangle r: arr
             ) {
            r.display();
            System.out.println("Area calculates to : " + r.getArea());
            System.out.println("--------------------------");
        }
    }
}
