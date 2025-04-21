package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereadingusingScanner
{
    public static void main(String[] args)
    {
        File file = new File("Example.txt");
        try
        {
            Scanner sc =new Scanner(file);
            while(sc.hasNextLine())
            {
                String line =sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
