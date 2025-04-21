package Loops;

import java.util.Scanner;

public class Switch {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        switch (n)
        {
            case 1: System.out.println("hello");
                    break;
            case 2:   System.out.println("hello hiii");
                    break;
            default:
                System.out.println("bye");


        }
    }
}
