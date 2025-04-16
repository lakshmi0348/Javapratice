package Collections.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample
{
    public static void main(String [] args)
    {
        LinkedHashMap <Integer,String> l = new LinkedHashMap<>();
        l.put(12,"java");
        l.put(13,"c");
        l.put(14,"Html");
        l.remove(12);
        l.containsValue("java");
        l.containsKey(13);
        l.keySet();
        l.values();
        l.entrySet();
        for(Integer i : l.keySet())
        {
            System.out.println(i+" "+l.get(i));
        }
    }
}
