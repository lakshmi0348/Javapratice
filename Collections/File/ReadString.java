package Collections.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadString{

    public  static  void main(String[] args)  {

        try {
            String wholefile = Files.readString(Paths.get("example.txt"));
            System.out.println(wholefile);
        } catch (IOException e) {
           throw new RuntimeException(e);
        }

    }
}
