package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	MenuItem IceCream = new MenuItem(1.99, "delicious", "dessert", true);
    MenuItem ChickenFriedSteak =  new MenuItem(1.99, "delicious", "dinner", true);
ArrayList<MenuItem> foodArray = new ArrayList<>();
        foodArray.add(IceCream);
    foodArray.add(ChickenFriedSteak);
    Menu businessName = new Menu(foodArray, "08/28/2023", "Hungry", "dinner");

    System.out.println(businessName.getBusinessName());
System.out.println(businessName.printItems());
    }
}
