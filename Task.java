import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

class Employee{
      String name;
      int id;
    String department;
    float salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int id, String department, float salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

public class Task {


    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("lakshmi",1,"it",30000));
        list.add(new Employee("swathi",2,"it",74000));
        list.add(new Employee("James",3,"Testing",320000));
        list.add(new Employee("Syam",4,"it",73000));
        list.add(new Employee("Bhaskar",5,"it",31000));
        list.add(new Employee("saraya",6,"Testing",70000));
        list.add(new Employee("Rajinth",8,"Testing",32000));
        list.add(new Employee("lucky",7,"it",73000));
        list.add(new Employee("lakshmiDurga",9,"it",35000));
        list.add(new Employee("swathihema",10,"Testing",70060));
        list.add(new Employee("JamesRao",11,"it",32000));
        list.add(new Employee("Syamraj",12,"Testing",70400));
        list.add(new Employee("Bhaskarteja",13,"frontend",30500));
        list.add(new Employee("sarayanya",14,"it",70400));
        list.add(new Employee("Rajintha",15,"it",30050));
        list.add(new Employee("likhitha",16,"it",70400));
        list.add(new Employee("lali",17,"frontend",30300));
        list.add(new Employee("geetha",18,"it",70300));
        list.add(new Employee("Jameswillam",19,"Testing",30040));
        list.add(new Employee("bhagya",20,"it",70500));
        list.add(new Employee("Tanoj",21,"Backend",30700));
        list.add(new Employee("veni",22,"frontend",70800));
        list.add(new Employee("raji",23,"frontend",35900));
        list.add(new Employee("pavan",24,"it",70080));
        list.add(new Employee("kishore",25,"Backend",35000));
        list.add(new Employee("Rathod",26,"it",70000));
        list.add(new Employee("deepika",27,"frontend",30000));
        list.add(new Employee("Manisha",28,"Backend",74000));
        list.add(new Employee("rohan",29,"it",30000));
        list.add(new Employee("usha",30,"frontend",74000));
        list.add(new Employee("krishna",31,"frontend",36000));
        list.add(new Employee("vamsi",32,"Backend",78000));
        list.add(new Employee("pavan",33,"it",30070));
        list.add(new Employee("vijaya",34,"Backend",70060));
        Scanner sc = new Scanner(System.in);
        boolean exit =false;
        while(!exit)
        {
            System.out.println("Enter the search Text");
            String s = sc.next().toUpperCase();
            System.out.println("Enter the Page  Number");
            int pageNo = sc.nextInt();
            if(pageNo<=0)
            {
                System.out.println("Note Page Number:User Entered Negative Number or Zero");
                break;
            }
            System.out.println("Enter the Sorting Column name");
            String SortedColumnName = sc.next().toLowerCase();
            System.out.println("Enter the Order ascending /Descending");
            String Order = sc.next().toLowerCase();
            System.out.println("Enter the page Size");
            int pageSize = sc.nextInt();
            Comparator<Employee> comparator = switch (SortedColumnName)
            {
                case "name" -> Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);
                case "id" -> Comparator.comparingInt(Employee::getId);
                case "department" -> Comparator.comparing(Employee::getDepartment, String.CASE_INSENSITIVE_ORDER);
                case "salary" -> Comparator.comparingDouble(Employee::getSalary);
                default -> null;
            };

            if(pageSize<=0)
            {
                System.out.println("Note page Size:User Entered Negative Number or Zero");
                break;
            }
            else {
                List<Employee> matchedList = list.stream()
                        .filter(emp ->
                                emp.getDepartment().toLowerCase().contains(s)||
                                        emp.getName().toLowerCase().contains(s) ||
                                        String.valueOf(emp.getId()).contains(s) ||
                                        String.valueOf((int) emp.getSalary()).contains(s))
                        .collect(Collectors.toList());

                int startingIndex = (pageNo - 1) * pageSize;
                int Endindex = Math.min(startingIndex + pageSize, matchedList.size());

                if (startingIndex >= matchedList.size()) {
                    System.out.println("No more records for the given page number.");
                } else {
                    List<Employee> pagedList = matchedList.subList(startingIndex, Endindex);
                    if(Order.equalsIgnoreCase("ascending")) {
                        pagedList.sort(comparator);
                    }
                    else {
                        pagedList.sort(comparator.reversed());
                    }
                    pagedList.forEach(System.out::println);
                }
                System.out.println("\nDo you want to continue? (yes/no)");
                String exitcheck = sc.next().toLowerCase();
                exit = exitcheck.equals("no");
            }

        }

    }
}
