package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.burger.Burger;

/*
*               Factory Method Pattern
*  - use it if you have no idea of the exact types of the objects
* your code will work with.
*  - makes it easy to extend the product construction code independently
* from the rest of the application - allows introducing new products without
* breaking existing code
*  - centralizes the product creation code in one place in the program
* */

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}
