package Operator;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        // Modulus operator is used to mod integers
        //% is used to modulus two integers

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);//Printing the result

    }
}
