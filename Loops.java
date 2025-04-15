import java.util.Scanner;

public class Loops {
    public  static  void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        do{
            System.out.println("Do while loop" +i);
            i++;
        }while(i!=5);
        for(i=0;i<=5;i++)
        {
            System.out.println("For loop "+i);
        }
        while(i!=12)
        {
            System.out.println(i+" while loop");
            i++;
        }

    }
}
