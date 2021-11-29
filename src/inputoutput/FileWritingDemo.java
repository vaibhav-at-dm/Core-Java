package inputoutput;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("/home/vaibhav.dubewar/Documents/WritingFile.txt",true); // if true is not passed then it will oveeride the initiol content of file
            String msg = " Akshay HAmbir";
            fout.write(msg.getBytes());
            System.out.println("Writing message ");

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
