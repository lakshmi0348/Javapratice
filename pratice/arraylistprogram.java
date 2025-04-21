package pratice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Student
{
    public String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }

    public int id;
    public double marks;

    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
public class arraylistprogram {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Student> a = new ArrayList<>();
        boolean exit =false;
        while(!exit)
        {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove by ID");
            System.out.println("4. Search by ID");
            System.out.println("5. Search by name");
            System.out.println("6. Sort by Name");
            System.out.println("7. Sort by Marks");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1: System.out.println("adding Students");
                        System.out.println("enter Student name" );
                        System.out.println("enter Student id" );
                        System.out.println("enter Student Marks" );
                        a.add(new Student(sc.next(),sc.nextInt(),sc.nextDouble()));
                        System.out.println("Student added Successfully");
                        break;
                case 2: if(a.size()==0)
                {
                    System.out.println("no Students are Registered");
                }
                else {
                    for(Student s : a)
                    {
                        System.out.println(s);
                    }
                }
                break;
                case 3: System.out.println("Remove the Student the for List");
                int index = sc.nextInt();
                    Iterator<Student> it = a.iterator();
                    boolean removed =false;
                    while (it.hasNext())
                    {
                        Student s =it.next();
                        if(s.getId()==index)
                        {
                            it.remove();
                            System.out.println("Student removed");
                            removed=true;
                            break;
                        }
                    }
                    if(!removed)
                    {
                        System.out.println("Student not found");
                    }
                    break;
                case 4: System.out.println("Enter ID to search");
                int id = sc.nextInt();
                boolean found =false;
                for(Student s: a)
                {
                    if(s.getId()==id)
                    {
                        System.out.println(" Id is found");
                        found=true;
                    }
                }
                if(!found)
                {
                    System.out.println("Id Not Found");
                }
                break;
                case 5: System.out.println("Search by name");
                String name = sc.next();
                boolean found1 = false;
                for(Student s : a)
                {
                    if(s.getName().equalsIgnoreCase(name))
                    {
                        System.out.println("Student name is found");
                        found1=true;
                    }
                }
                if(!found1)
                {
                    System.out.println("Student is not found");
                }
                break;
                case 6: System.out.println("Sort by marks");
                a.sort(Comparator.comparingDouble(Student::getMarks));
                a.forEach(System.out::println);
                break;
                case 7:System.out.println("Sort by name");
                    a.sort(Comparator.comparing(Student::getName));
                    a.forEach(System.out::println);
                    break;
                case 9: a.removeIf(s->s.getMarks()<50);
                        a.forEach(System.out::println);
                        break;
                case 10:a.toArray();
                            //System.out.println(a);
                case 11:a.replaceAll(s->new Student(s.name,s.id,s.marks+5));
                        a.forEach(System.out::println);
                    break;
                case 8 : exit=true;
                System.out.println("Exit");
                break;
                default:System.out.println("Invalid choice");


            }
        }

    }

}
