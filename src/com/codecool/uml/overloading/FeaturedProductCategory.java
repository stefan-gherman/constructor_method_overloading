package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {
    Date startDate = new Date();
    Date endDate = new Date();

    public FeaturedProductCategory() {
        super();
    }

    public FeaturedProductCategory(String name, String department, String description) {
        super(name, department, description);

    }
    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
