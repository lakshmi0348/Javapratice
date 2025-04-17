public class laptop {

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
}
