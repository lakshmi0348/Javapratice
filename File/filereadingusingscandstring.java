package File;

import java.util.Scanner;

public class filereadingusingscandstring {
    public static void main(String[] args)
    {
        String s ="12345 67876 54321";
        Scanner sc =new Scanner(s);

        while(sc.hasNextInt())
        {
            int res =sc.nextInt();
            System.out.println(res);
        }
    }
}
