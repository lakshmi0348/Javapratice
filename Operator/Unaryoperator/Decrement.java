package Operator.Unaryoperator;

import java.util.Scanner;

public class Decrement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(--a);// pre Increment
        System.out.println(a--);// post Increment

    }
}
