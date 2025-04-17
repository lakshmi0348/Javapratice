package Streampratice;

public class Employee {
    public String name;
    public int id;

    public Employee(String name, int id, String deptno) {
        this.name = name;
        this.id = id;
        this.deptno = deptno;
    }

    public String deptno;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", deptno='" + deptno + '\'' +
                '}';
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

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }
}
