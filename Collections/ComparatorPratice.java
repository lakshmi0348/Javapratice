package Collections;

import java.util.*;

class laptop implements  Comparable<laptop>{

    public String Name;
    public int ram;
    public int price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "Name='" + Name + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    public laptop(String name, int ram, int price) {
        Name = name;
        this.ram = ram;
        this.price = price;
    }


    @Override
    public int compareTo(laptop o) {
        if(this.getPrice()>o.getPrice())
        {
            return -1;
        }
        else {
            return 1;
        }
    }
}


public class ComparatorPratice {
    public static void main(String[] args)
    {
        List<laptop> l  = new ArrayList<>();
        l.add(new laptop("Acer",24,400));
        l.add(new laptop("hp",4 ,1200));
        l.add(new laptop("dell",8,800));
        l.add(new laptop("Acer",8,400));
        Comparator<laptop> com =new Comparator<laptop>() {
            @Override
            public int compare(laptop o1, laptop o2) {
                if(o1.getRam()>o2.getRam())
                {
                    return -1;
                }
                else
                {
                    return 1;
                }

            }
        };
        Collections.sort(l);

        for(laptop l1: l)
        {
            System.out.println(l1);
        }
        System.out.println();
        Collections.sort(l,com);
        for(laptop l1: l)
        {
            System.out.println(l1);
        }
    }


}
