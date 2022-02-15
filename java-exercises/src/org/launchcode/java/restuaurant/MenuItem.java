package org.launchcode.java.restuaurant;



import java.util.Date;

public class MenuItem {

    private static final int NEW_ITEM_DURATION_IN_DAYS = 7;
    private String name;
    private String description;
    private double price;
    private String category;
    private final Date added;

    public MenuItem(String name, String description, double price,
                    String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.added = new Date();
    }

    public MenuItem(String name, double price, String category) {
        this(name, "", price, category);
    }

    public MenuItem(String name, double price) {
        this(name, "", price, "entree");
    }

    public boolean isNew() {
        long nowInMs = new Date().getTime();
        long newItemDurationInMs = NEW_ITEM_DURATION_IN_DAYS *24*60*1000;
        return nowInMs - added.getTime() < newItemDurationInMs;
    }


}