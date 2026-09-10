package org.example;

public interface PizzaBuilder {
    void setSize(String size);
    void setCrust(String crust);
    void setSauce(String sauce);
    void addCheese();
    void addPepperoni();
    void addMushrooms();
    Pizza build();
}
