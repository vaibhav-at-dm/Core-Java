package MyPack;

public class ProductArray {
    public static void main(String[] args) {
        Product[] arr = new Product[3];    // array of objects

        arr[0] = new Product();
        arr[1] = new Product();
        arr[2] = new Product();

        arr[0].setId(100);
        arr[1].setId(101);
        arr[2].setId(102);

        arr[0].setPname("Phone");
        arr[1].setPname("Tablet");
        arr[2].setPname("Keyboard");

        arr[0].setPrice((float) 99.99);
        arr[1].setPrice((float) 299.87);
        arr[2].setPrice((float) 499);


        for (Product obj: arr
             ) {
            System.out.println("Product Name : "+ obj.getPname());
            System.out.println("Price is " + obj.getPrice());
            System.out.println("ID : " + obj.getId());
            System.out.println();

        }
    }
}
