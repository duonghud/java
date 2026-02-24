package java2.buoi4.Lythuyet.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Catalogs {
    private String name;
    private List<Products> productsList;
    public Catalogs(String name){
        this.name = name;
        productsList = new ArrayList<>();
    }

    public void addProduct(Products products){
        this.productsList.add(products);
    }
}
