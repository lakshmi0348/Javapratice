package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args)
    {
        ArrayList <Integer> a = new ArrayList<>();
        a.add(23);
        a.add(67);
        a.add(89);
        Integer i1 =23;
       a.remove(i1);

        System.out.println(a);
        Collections.sort(a);
        for(Integer i : a)
        {
            System.out.println(i);
        }
        //a.remove();
        for(Integer i : a)
        {
            System.out.println(i);
        }
       System.out.println( a.get(1));
        a.set(1,78);
        System.out.println( a.get(1));
        System.out.println(a.contains(23));
        System.out.println(a.contains(78));
        System.out.println(a.size());
        Iterator itr=a.iterator();
        while(itr.hasNext())
                {
                    System.out.println(itr.next());
                }
    }
}
