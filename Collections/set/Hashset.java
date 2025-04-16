package Collections.set;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset {
    public  static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Set<String> s = new HashSet<>();
        s.add("h");
        s.add("y");
        s.addAll(s);
        s.contains("y");
        s.remove("h");
        System.out.println(s.size());
        for(String sr:s)
        {
            System.out.println(sr);
        }
        Set<String> f = new HashSet<>();
        f.add("j");
        f.add("h");
        f.add("y");
        s.toArray();
       System.out.println(s.retainAll(f));
       System.out.println(s.containsAll(f));
       System.out.println(s.equals("h"));
       System.out.println(s.hashCode());
       System.out.println(s.spliterator());
       //s.removeAll(f);
       System.out.println(s);


    }
}
