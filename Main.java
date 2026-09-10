package org.example;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector(new MargheritaPizzaBuilder());
        System.out.println(director.makeMargherita());
        director = new PizzaDirector(new PepperoniPizzaBuilder());
        System.out.println(director.makePepperoni());
        Pizza custom = new MargheritaPizzaBuilder().setSize("Small").addCheese().addMushrooms().build();
        System.out.println(custom);
    }
}
