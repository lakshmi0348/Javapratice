package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
    public static void main(String[] args)  {
        FileInputStream fis ;
        try {

           fis = new FileInputStream("C:\\Users\\laksh\\Javapratice\\Collections\\File\\abc.txt");
            int data ;
           while((data = fis.read())!=-1)
           {

               System.out.print((char)data+" ");
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
