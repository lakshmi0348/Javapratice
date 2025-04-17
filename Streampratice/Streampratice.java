package Streampratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Streampratice {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        l.add(34);
        l.add(89);
        l.add(78);
        l.add(90);
        l.add(78);
     long res= l.stream().
             reduce(0,(a,b)->a+b);
     System.out.println(res);
    }
}
