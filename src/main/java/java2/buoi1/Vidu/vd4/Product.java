package java2.buoi1.Vidu.vd4;

/*
/
 */
public class Product {
    private String name;
    private int price;
    private double quantity;
    private String description;

    public Product setName(String name){
        if (!name.trim().isEmpty()){
            this.name = name;
        }
        return this;
    }

    public Product setPrice(int price){
        this.price = price;
        return this;
    }

    public Product setQuantity(double quantity){
        this.quantity = quantity;
        return this;
    }

    public Product setDescription(String description){
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
