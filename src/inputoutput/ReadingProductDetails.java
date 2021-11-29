package inputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingProductDetails {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/vaibhav.dubewar/Documents/ProductDetails.txt");
            DataInputStream data = new DataInputStream(fin);
            System.out.println("Product Details : ");
            System.out.println("Product Id : " + data.readInt());
            System.out.println("Product Name : " + data.readUTF());
            System.out.println("Product Price : " + data.readFloat());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
