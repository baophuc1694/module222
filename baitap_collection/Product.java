package baitap_collection;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int id;
    private String name;
    private double price;

    public Product(){
    }
    public Product(int id, String name, double price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(Product pro1, Product pro2) {
        if (pro1.getPrice() < pro2.getPrice())
            return 1;
        else if (pro1.getPrice() > pro2.getPrice())
            return -1;
        else
        return 0;
    }
}
