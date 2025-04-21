package Collections.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordlineschar
{
    public static  void main(String[] args)
    {
        int line=0,word=0,chara=0;
        try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))){
            String lines ;

            while((lines= br.readLine())!=null)
            {
                System.out.println(lines);
                line++;
                chara+=lines.length();
                word += lines.split("\\s+").length;

            }
            System.out.println(line);
            System.out.println(word);
            System.out.println(chara);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
