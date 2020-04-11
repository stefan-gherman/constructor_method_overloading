package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Webshop {

    private List<Product> productList = new ArrayList<Product>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsFilteredByProductByCategory = new ArrayList<Product>();
        return productsFilteredByProductByCategory;
    }
    public List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsFilteredByProductBySupplier = new ArrayList<Product>();
        return productsFilteredByProductBySupplier;
    }
    public static void main(String[] args) {
	// write your code here
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        Currency currency;
        Product p5 = new Product("Gatorade", 3.99f, currency =  Currency.getInstance("EUR"));
        System.out.println(p5.toString());

    }
}
