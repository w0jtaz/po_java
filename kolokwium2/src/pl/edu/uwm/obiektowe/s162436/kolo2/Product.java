package pl.edu.uwm.obiektowe.s162436.kolo2;

public abstract class Product {
    String name;
    long id;
    double price;

    public Product(String name, long id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: name ->" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
