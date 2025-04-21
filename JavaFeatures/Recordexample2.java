package JavaFeatures;

record Alien1(int age ,String name)
{

}
public class Recordexample2 {
    public static void main(String[] args)
    {
        Alien1 obj1 =new Alien1(24,"lucky");
        Alien1 obj2 =new Alien1(24,"lucky");
        System.out.println(obj1.equals(obj2));
    }
}
