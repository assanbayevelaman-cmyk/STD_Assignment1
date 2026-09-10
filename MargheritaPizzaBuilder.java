package org.example;

public class MargheritaPizzaBuilder implements PizzaBuilder {
    private String size = "Medium";
    private String crust = "Thin";
    private String sauce = "Tomato";
    private boolean cheese, pepperoni, mushrooms;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }
    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }
    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }
    public PizzaBuilder addMushrooms() {
        this.mushrooms = true;
        return this;
    }
    public Pizza build() {
        return new Pizza(size, crust, sauce, cheese, pepperoni, mushrooms);
    }
}
