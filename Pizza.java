package org.example;
public class Pizza {
    private String size;
    private String crust;
    private String sauce;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    public Pizza(String size, String crust, String sauce, boolean cheese, boolean pepperoni, boolean mushrooms) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
    }
    @Override
    public String toString() {
        return "Pizza{" + size + ", " + crust + ", " + sauce +
                ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", mushrooms=" + mushrooms + "}";
    }
}
