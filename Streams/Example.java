package Streams;

import javax.xml.stream.StreamFilter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void StreamFilter()
    {
        List<String > list = new ArrayList<>();
        long count1 =0;
        list.add("Bhagya");
        list.add("amala");
        list.add("cherry");
        list.add("Mamu");
        list.add("abhi");
       count1= list.stream().filter(s->s.startsWith("A")).count();
       System.out.println(count1);
     long f=  Stream.of("Bhagya","amala","cherry","Mamu","abhi").filter(s->
       {
           s.startsWith("a");
           return  true;
       }).count();
        System.out.println(f);


        list.stream().filter(s->s.length()>4).forEach(System.out::println);
        list.stream().filter((s->s.length()<=4)).forEach(s->System.out.println(s));
        list.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));

    }
    public static void main(String[] args)

    {
        List<String > list = new ArrayList<>();
        int count =0;
        list.add("Bhagya");
        list.add("amala");
        list.add("cherry");
        list.add("Mamu");
        list.add("abhi");
        StreamFilter();
        StreamMap();
        StreamCollect();
        for(int i=0;i<list.size();i++)
        {
            String s = list.get(i);
            if(s.startsWith("a"))
            {
                count++;
            }

        }
        //System.out.println(count);

    }
    public static void StreamMap()
    {
        Stream.of("Bhagya","amala","cherry","Mamu","abhi").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        Stream.of("Bhagya","amala","cherry","Mamu","abhi").filter(s->s.startsWith("a")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
        List<String > list = new ArrayList<>();
        list.add("Bhagya");
        list.add("amala");
        list.add("cherry");
        list.add("Mamu");
        list.add("abhi");
        List<String > list2 = new ArrayList<>();
        list2.add("Bhagyamani");
        list2.add("amala sri");
        list2.add("cherry raj");
        list2.add("Mamu chinna");
        list2.add("abhi raj");
        list.add("Mamu");
        list.add("abhi");
        Stream<String> newStream=Stream.concat(list.stream(),list2.stream()).distinct();
        newStream.forEach(s->System.out.println(s));
      // boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("amala"));
       //newStream.sorted().forEach(s->System.out.println(s));
       //Assert.assertTrue(flag);


    }
    public static void StreamCollect()
    {
       List l = Stream.of("Bhagya","amala","cherry","Mamu","abhi").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
       System.out.println(l.get(0));

List <Integer> names = Arrays.asList(3,2,4,5,6,4,6,7);
 names.stream().distinct().forEach(s->System.out.println(s));
 names.stream().distinct().sorted().forEach(s->System.out.println(s));
int sum= names.stream().reduce(0,(a,b)->a+b);
System.out.println(sum);

       Set s = Stream.of("Bhagya","amala","cherry","Mamu","abhi").filter(s1->s1.startsWith("a")).map(s1->s1.toUpperCase()).collect(Collectors.toSet());
       HashMap<Integer,String> M =Stream.of("Bhagya","amala","cherry","Mamu","abhi").filter(s2->s2.length()>4).map(s2->s2.toUpperCase()).collect(Collectors.toMap(str->str.length(),str->str,(s1,s2)->s1,HashMap::new));

    }
}
