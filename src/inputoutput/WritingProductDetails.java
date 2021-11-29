package inputoutput;

import java.io.*;

public class WritingProductDetails {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter Product Details ");
            System.out.println();
            System.out.println("Enter ID : ");

            int pid = Integer.parseInt(br.readLine());

            System.out.println("Enter Product Name ");
            String pNAme = br.readLine();

            System.out.println("Enter Price ");
            float price = Float.parseFloat(br.readLine());

            FileOutputStream fout = new FileOutputStream("/home/vaibhav.dubewar/Documents/ProductDetails.txt",true);
            DataOutputStream data = new DataOutputStream(fout);  // for writing primitive data
            data.writeInt(pid);
            data.writeUTF(pNAme); // data.write(pName.getBytes())
            data.writeFloat(price);

            System.out.println("Product Added !");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
