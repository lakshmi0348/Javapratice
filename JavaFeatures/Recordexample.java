package JavaFeatures;

import java.util.Objects;

class Alien
{
    private int age;
    private String name;

    public Alien(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return age == alien.age && Objects.equals(name, alien.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Recordexample {
    public static void main(String[] args)
    {
        Alien obj1 =new Alien(24,"lucky");
        Alien obj2 =new Alien(24,"lucky");
        System.out.println(obj1.equals(obj2));
    }
}
