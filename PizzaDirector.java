package org.example;

public class PizzaDirector {
    private PizzaBuilder builder;
    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }
    public Pizza makeMargherita() {
        return builder.setSize("Large").setCrust("Thin").setSauce("Tomato").addCheese().build();
    }
    public Pizza makePepperoni() {
        return builder.setSize("Large").setCrust("Thick").setSauce("Tomato").addCheese().addPepperoni().build();
    }
}
