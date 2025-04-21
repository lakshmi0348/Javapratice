package pratice;

import java.util.Scanner;
import java.util.Stack;

public class stackExample {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(45);
        s.push(78);
        s.push(89);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.search(45));
        System.out.println(s.empty());
        for(Integer i :s)
        {
            System.out.println(i);
        }
    }
}
