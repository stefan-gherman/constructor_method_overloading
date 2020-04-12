package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.List;

public class Webshop {


    public static void main(String[] args) {
	// write your code here
        Warehouse warehouse = new Warehouse();

        Supplier RedBull = new Supplier("RedBull", "RedBull gives you wings!");
        Supplier Gatorade = new Supplier("Gatorade", "Fuel for more");
        Supplier Burn = new Supplier();
        Supplier Pepsi = new Supplier("Pepsi", "Open for more");
        Supplier Mirinda = new Supplier();
        Supplier CapriSun = new Supplier();

        Burn.setName("Burn");
        Burn.setDescription("Burn like hell");
        Mirinda.setName("Mirinda");
        Mirinda.setDescription(Gatorade.getName());
        CapriSun.setName("CapriSun");
        CapriSun.setDescription("CapriSun is good");



        ProductCategory soda = new ProductCategory("Sodas","Food & Drinks","Drink it man");
        ProductCategory energyDrinks = new ProductCategory();
        ProductCategory drinksForKids = new FeaturedProductCategory();
        ((FeaturedProductCategory) drinksForKids).schedule(new Date(1990, 10, 26, 0, 0), new Date(1990,11,26,0,0));

        energyDrinks.setName("Energy Drinks");
        energyDrinks.setDepartment("Food & Drinks");
        energyDrinks.setDescription("Drink");

        drinksForKids.setName("KIds");
        drinksForKids.setDescription("Kids drinks");
        drinksForKids.setDepartment("Foods and Drinks");

        Product MirindaOrange = new Product("Mirirnda Orange", 1.99f, Currency.getInstance("USD"));
        MirindaOrange.setSupplier(Mirinda);
        MirindaOrange.setProductCategory(soda);
        warehouse.addProduct(MirindaOrange);

        Product MirindaMango = new Product("Mirirnda Mango", 2.99f, Currency.getInstance("EUR"));
        MirindaMango.setSupplier(Mirinda);
        MirindaMango.setProductCategory(soda);
        warehouse.addProduct(MirindaMango);


        Product CapriSunStrawberry = new Product();
        CapriSunStrawberry.setSupplier(Mirinda);
        CapriSunStrawberry.setProductCategory(soda);
        warehouse.addProduct(CapriSunStrawberry);


        Product CapriSunLemon = new Product("CapriSun Lemon", 1.99f, Currency.getInstance("EUR"));
        CapriSunLemon.setSupplier(CapriSun);
        CapriSunLemon.setProductCategory(drinksForKids);
        warehouse.addProduct(CapriSunLemon);

        Product PepsiTwist = new Product();
        PepsiTwist.setSupplier(Pepsi);
        PepsiTwist.setProductCategory(soda);
        warehouse.addProduct(PepsiTwist);


        Product PepsiZero = new Product("Pepsi Zero", 5.99f, Currency.getInstance("ROL"));
        PepsiZero.setSupplier(Pepsi);
        PepsiZero.setProductCategory(drinksForKids);
        warehouse.addProduct(PepsiZero);


        Product RedBullClassic = new Product("Red Bull Clasic", 6.99f, Currency.getInstance("USD"));
        RedBullClassic.setSupplier(RedBull);
        RedBullClassic.setProductCategory(energyDrinks);
        warehouse.addProduct(RedBullClassic);

        Product RedBullNoSugar = new Product("Red Bull No Sugar", 2.99f, Currency.getInstance("EUR"));
        RedBullNoSugar.setSupplier(RedBull);
        RedBullNoSugar.setProductCategory(energyDrinks);
        warehouse.addProduct(RedBullNoSugar);

       warehouse.printProductsList(warehouse.getProducts());
        System.out.println("-------------------------");
       warehouse.printProductsList(warehouse.getAllProductsBy(RedBull));
        System.out.println("-------------------------");
      warehouse.printProductsList(warehouse.getAllProductsBy(soda));
    }
}
