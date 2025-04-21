package Collections.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Readalllines {

    public static  void main(String[] args)
    {
        try
        {
            List<String> li= Files.readAllLines(Paths.get("example.txt"));
            for(String line : li)
            {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
