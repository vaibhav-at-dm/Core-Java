package inputoutput;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter message : ");
            String msg = br.readLine();

            FileWriter writer = new FileWriter("/home/vaibhav.dubewar/Documents/message.txt",true);
            writer.write("\n"+msg);
            writer.flush();
            System.out.println("Writing File !!");

            System.out.println();

            System.out.println("Reading data from file ");
            FileReader fr = new FileReader("/home/vaibhav.dubewar/Documents/message.txt");
            BufferedReader br1 = new BufferedReader(fr);
            // System.out.println(br1.readLine()); single line will be returned
            String str = null;
            while ((str = br1.readLine()) != null)
            {
//                str = br1.readLine();
                System.out.println(str);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
