import designPatterns.creational.abstractFactoryMethod.factories.AsusManufacturer;
import designPatterns.creational.abstractFactoryMethod.factories.Company;
import designPatterns.creational.abstractFactoryMethod.factories.MsiManufacturer;
import designPatterns.creational.abstractFactoryMethod.products.Product;
import designPatterns.creational.factoryMethod.BeefBurgerRestaurant;
import designPatterns.creational.factoryMethod.Restaurant;
import designPatterns.creational.factoryMethod.VeggieBurgerRestaurant;
import designPatterns.creational.factoryMethod.burger.Burger;
import designPatterns.creational.singleton.Singleton;

import java.util.List;

public class Main {

    public static Singleton singleton = Singleton.getInstance("test");
    public static Singleton singleton2 = Singleton.getInstance("test2");
    public static void main(String[] args) {

        // Singleton
        System.out.println(singleton.getData());
        System.out.println(singleton2.getData());

        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();

        // Factory method
        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();

        // Abstract Factory method
        Company asus = new AsusManufacturer();
        Company msi = new MsiManufacturer();
        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);
    }
}