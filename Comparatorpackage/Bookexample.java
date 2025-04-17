package Comparatorpackage;

import java.util.*;

public class Bookexample {

    public static  void main(String[] args)
    {
        List<Book> b = new ArrayList<>();
        b.add(new Book("RAMAYANA","JAMES",3000));
        b.add(new Book("novel of the great india","williams",4500));
        b.add(new Book("High and lows","Swathin",6000));
        b.add(new Book("Java","Syam",6788));
        Collections.sort(b);
        for(Book b1:b)
        {
            System.out.println(b1);
        }
        System.out.println();
        Comparator<Book> bom = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.getPrice()<o2.getPrice())
                    return -1;
                else
                    return 0;
            }
        };
        Collections.sort(b,bom);
        for(Book b2:b)
        {
            System.out.println(b2);
        }
    }
}
