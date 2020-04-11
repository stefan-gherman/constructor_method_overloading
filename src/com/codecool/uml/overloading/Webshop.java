package com.codecool.uml.overloading;

import java.util.ArrayList;
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
    }
}
