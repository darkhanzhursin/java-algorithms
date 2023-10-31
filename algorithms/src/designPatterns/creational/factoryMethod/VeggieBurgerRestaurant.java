package designPatterns.creational.factoryMethod;

import designPatterns.creational.factoryMethod.burger.Burger;
import designPatterns.creational.factoryMethod.burger.impl.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie burger...");
        return new VeggieBurger();
    }
}
