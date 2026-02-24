package java2.buoi4.Lythuyet.Aggregation;

public class Products {
    private String name;
    private double price;

    public Products(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }
}
