package designPatterns.creational.factoryMethod.burger.impl;

import designPatterns.creational.factoryMethod.burger.Burger;

public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Burger from beef meat is preparing.");
    }
}
