package pratice;
import java.util.*;
class Student1
{
    public int id;
    public String name;

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student1(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public double marks;
}
public class StudentManager {
    private List<Student1> students = new ArrayList<>();

    // Add a new student
    public boolean addStudent(Student1 student) {
        for (Student1 s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student ID already exists.");
                return false;
            }
        }
        students.add(student);
        return true;
    }

    // Update marks for a student by ID
    public boolean updateMarks(int id, int newMarks) {
        for (Student1 s : students) {
            if (s.getId() == id) {
                s.setMarks(newMarks);
                return true;
            }
        }
        System.out.println("Student ID not found.");
        return false;
    }

    // Remove a student by ID
    public boolean removeStudent(int id) {
        Iterator<Student1> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        System.out.println("Student ID not found.");
        return false;
    }

    // Retrieve top N students by marks
//    public List<Student1> getTopStudents(int n) {
//        return students.stream()
//                .sorted((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()))
//                .limit(n)
//                .toList();
//    }

    // Calculate average marks
//    public double calculateAverageMarks() {
//        if (students.isEmpty()) return 0.0;
//        int total = students.stream().mapToInt(Student::getMarks).sum();
//        return (double) total / students.size();
//    }

    // Display all students
    public void displayAllStudents() {
        students.forEach(System.out::println);
    }
    public class Main {
        public static void main(String[] args) {
            StudentManager manager = new StudentManager();

            // Adding students
            manager.addStudent(new Student1(101, "Alice", 85));
            manager.addStudent(new Student1(102, "Bob", 92));
            manager.addStudent(new Student1(103, "Charlie", 78));
            manager.addStudent(new Student1(104, "Diana", 90));
            manager.addStudent(new Student1(105, "Ethan", 88));

            // Display all students
            System.out.println("All Students:");
            manager.displayAllStudents();

            // Update marks
            manager.updateMarks(103, 82);

            // Remove a student
            manager.removeStudent(104);

            // Display top 3 students
            System.out.println("\nTop 3 Students:");
//            manager.getTopStudents(3).forEach(System.out::println);

            // Calculate average marks
//            double average = manager.calculateAverageMarks();
//            System.out.println("\nAverage Marks: " + average);
        }
    }

}

