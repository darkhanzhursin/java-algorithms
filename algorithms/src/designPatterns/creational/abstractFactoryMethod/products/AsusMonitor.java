package designPatterns.creational.abstractFactoryMethod.products;

public class AsusMonitor implements Monitor {

    @Override
    public void assemble() {
        // Logic relevant to ASUS Monitors
        System.out.println("Assembling ASUS Monitor");
    }
}
