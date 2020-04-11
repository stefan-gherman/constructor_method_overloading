package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {

    private int id=0;
    private static int incrementer = 0;
    private String name ="Category";
    private String department = "Department";
    private String description = "Description";

    public ProductCategory() {
        this.id = incrementer;
        incrementer +=1;
    }

    public ProductCategory(String name, String department, String description) {
        this.id = incrementer;
        incrementer+=1;
        this.name = name;
        this.description = description;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getDescription(Warehouse warehouse) {
        return warehouse.getAllProductsBy(this);
    }

    @Override
    public String toString() {
        return "ProductCategory: {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
