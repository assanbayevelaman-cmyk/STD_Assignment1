package org.example;

public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setCrust(String crust);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder addCheese();
    PizzaBuilder addPepperoni();
    PizzaBuilder addMushrooms();
    Pizza build();
}
