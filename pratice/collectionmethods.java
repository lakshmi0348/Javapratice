package pratice;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class collectionmethods {

    public static  void main(String[] args)
    {
        List<Integer> l = new ArrayList<>();
        l.add(23);
        l.add(56);
        l.add(89);
        l.add(3,34);
        Collections.sort(l);
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        l.remove(Integer.valueOf(56));
        System.out.println(l);
        l.get(0);
        l.set(1,5);
        Collections.sort(l);


    }
}
