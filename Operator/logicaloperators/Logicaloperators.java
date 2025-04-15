package Operator.logicaloperators;

import java.util.Scanner;

public class Logicaloperators {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));


    }


}
