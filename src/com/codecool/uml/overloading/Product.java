package com.codecool.uml.overloading;


import java.util.Currency;

public class Product {

    private static int idIncrementer = 0;
    private int id = 0;
    private String name;
    private float defaultPrice = 0.99f;
    private Currency defaultCurrency = Currency.getInstance("USD");
    private ProductCategory productCategory;
    private Supplier supplier;


    public Product() {
        this.id = idIncrementer;
        this.name = String.format("Product #%s", this.id);
        idIncrementer += 1;
        this.productCategory = null;
        this.supplier = null;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = idIncrementer;
        idIncrementer+=1;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
    }



    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return this.defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product:{" +
                "id=" + this.id +
                ", name='" + name + '\'' +
                ", defaultPrice=" + defaultPrice +
                ", defaultCurrency=" + defaultCurrency +
                ", productCategory=" + productCategory +
                ", supplier=" + supplier +
                '}';
    }
}
