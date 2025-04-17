import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
public static void main(String[] args)
{
    String filepath ="example.txt";
    try(BufferedReader bf= new BufferedReader(new FileReader(filepath))){

        String line;
        while((line= bf.readLine())!=null)
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
