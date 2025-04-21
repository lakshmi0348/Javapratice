package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fis =new FileInputStream("abc.txt");
        FileOutputStream fos =new FileOutputStream("dfc.txt");
        int data;
        while((data=fis.read())!=-1)
        {
            fos.write(data);
        }
        System.out.println("file copied");

    }
}
