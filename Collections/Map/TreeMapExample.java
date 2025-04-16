package Collections.Map;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String [] args)
    {
        TreeMap <Integer,String> Tm = new TreeMap<>();
        Tm.put(1,"Bhagya");
        Tm.put(2,"lakshmi");
        Tm.put(3,"vijaya");
        Tm.put(4,"Geetha");
        for(Integer i : Tm.keySet())
        {
            System.out.println(i+" "+Tm.get(i));
        }
        Tm.containsValue("Geetha");
        Tm.containsKey(2);
        Tm.keySet();
        Tm.values();
        Tm.entrySet();
        Tm.get(1);
        Tm.firstEntry();
        Tm.firstKey();
        Tm.lastEntry();
        Tm.lastEntry();
        Tm.higherKey(1);
        Tm.lowerKey(1);
        Tm.higherEntry(3);
        Tm.lowerEntry(4);
        Tm.subMap(1,3);


    }
}
