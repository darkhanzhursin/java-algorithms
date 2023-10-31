package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.burger.Burger;
import designPatterns.creational.factoryMethod.burger.impl.BeefBurger;

public class BeefBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef burger..");
        return new BeefBurger();
    }
}
