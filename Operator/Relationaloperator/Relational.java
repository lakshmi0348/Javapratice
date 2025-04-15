package Operator.Relationaloperator;

import java.util.Scanner;

public class Relational {
    // == != < > <= >=
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
                System.out.println("A, B are equal");
        } else if (a < b) {
            System.out.println("A is lesser than B");
        } else if (a > b) {
            System.out.println("A is greater than B");
        } else if (a <= b) {
            System.out.println("A is Lesser than equal to B");
        } else if (a >= b) {
            System.out.println("A is greater than equal to  B");
        } else {
            System.out.println("A, B are not equal");
        }
    }
}
