package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> productList = new ArrayList<Product>();


    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        for (Product product:productList
             ) {

        }
        return productList;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsFilteredByProductByCategory = new ArrayList<Product>();

        for (Product product:productList
             ) {
            if(product.getProductCategory().equals(productCategory)) {
                productsFilteredByProductByCategory.add(product);
            }

        }
        return productsFilteredByProductByCategory;
    }
    public List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsFilteredByProductBySupplier = new ArrayList<Product>();
        for (Product product:productList
        ) {
            if(product.getSupplier().equals(supplier)) {
                productsFilteredByProductBySupplier.add(product);
            }
        }
        return productsFilteredByProductBySupplier;
    }
    public void printProductsList(List<Product> prodList){
        for (Product product:prodList
        ) {
            System.out.println(product.toString());
        }
    }
}
