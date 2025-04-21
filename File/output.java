package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class output {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream("bbc.txt");
        fos.write(5);
        fos.write(67);
        System.out.println("data is saved");
        fos.close();

    }
}
