package org.launchcode;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private String lastUpdate;
        private String businessName;
        private String category; //lunch,dinner, beverages//

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Menu(ArrayList<MenuItem> Items, String lastUpdate, String businessName, String category){
this.items = items;
this.lastUpdate = lastUpdate;
this. businessName = businessName;
this.category = category;

}
public ArrayList<String> printItems() {
        ArrayList<String> anything = new ArrayList<>();
        for(int i = 0; i < items.size(); i++){
            anything.add("Description: " + items.get(i).getDescription() + "$" + items.get(i).getPrice() + items.get(i).getCategory());
        }
            return anything;
}
}
