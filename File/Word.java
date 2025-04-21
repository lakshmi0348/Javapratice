package File;

import java.io.*;
import java.util.Scanner;

public class Word

{
    public static  void main(String[] args)
    {
        try{
            File file = new File("example.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext())
            {
                String word = sc.next();
                System.out.println(word);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
