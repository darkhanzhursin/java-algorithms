package designPatterns.creational.factoryMethod.burger.impl;

import designPatterns.creational.factoryMethod.burger.Burger;

public class VeggieBurger implements Burger {


    @Override
    public void prepare() {
        System.out.println("Veggie burger is preparing.");
    }
}
