package Operator.Assignmentoperator;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();
        int c=0,d=0,e=1,f=1;
        c += a;
        d -= b;
        e %= c;
        f /= a;
        f *= b;
        System.out.println(c +" "+d +" "+e +" "+f+" "+a +" "+b);
    }
}
