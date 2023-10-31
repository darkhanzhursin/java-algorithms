import designPatterns.creational.factoryMethod.BeefBurgerRestaurant;
import designPatterns.creational.factoryMethod.Restaurant;
import designPatterns.creational.factoryMethod.VeggieBurgerRestaurant;
import designPatterns.creational.factoryMethod.burger.Burger;
import designPatterns.creational.singleton.Singleton;

public class Main {

    public static Singleton singleton = Singleton.getInstance("test");
    public static Singleton singleton2 = Singleton.getInstance("test2");
    public static void main(String[] args) {

        //System.out.println(singleton.getData());
        //System.out.println(singleton2.getData());

        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();


        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();
    }
}