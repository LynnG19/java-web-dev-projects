package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem = false;
public MenuItem(double price, String description, String category, boolean newItem){
    this.price = price;
    this.description = description;
    this.category = category;
    this.newItem = newItem;
}
    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCateogory() {
        return cateogory;
    }

    public Boolean getNewItem() {
        return newItem;
    }
}
