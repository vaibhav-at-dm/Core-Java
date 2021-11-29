package inputoutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) {
        File file = new File("/home/vaibhav.dubewar/Documents/textFile.txt");
        if (file.exists())
        {
            try {
                FileInputStream fin = new FileInputStream(file);     // file will be open in the read mode
                int ch = 0;
                while ((ch = fin.read()) != -1)
                {
                    System.out.print((char) ch);
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("File Not Exist");
        }

    }
}
