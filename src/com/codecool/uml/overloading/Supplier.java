package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id = 0;
    private static int incerementer = 0;

    private String name = "Supplier";
    private String description = "Description";

    public Supplier() {
        this.id = incerementer;
        incerementer+=1;
    }

    public Supplier(String name, String description) {
        this.id = incerementer;
        incerementer+=1;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts(Warehouse warehouse) {
        return warehouse.getAllProductsBy(this);
    }

    @Override
    public String toString() {
        return "Supplier: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
