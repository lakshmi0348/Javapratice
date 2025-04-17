package Streampratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingexample {
    public static void main(String[] args)
    {
        List<Employee> li = new ArrayList<>();
        li.add(new Employee("lakshmi",1,"Development"));
        li.add(new Employee("bhagya",2,"Development"));
        li.add(new Employee("pavan",3,"Testing with selenium"));
        li.add(new Employee("veni",4,"Testing with selenium"));
        li.add(new Employee("Tanoj ",5,"Python Developer"));
        Map<String, List<Employee>> groupedByDept = li.stream()
                .collect(Collectors.groupingBy(Employee::getDeptno));
       groupedByDept.forEach((dept,emplist)->
       {
           System.out.println("department" + dept);
           emplist.forEach(System.out::println);
           System.out.println();
       } );




    }
}
