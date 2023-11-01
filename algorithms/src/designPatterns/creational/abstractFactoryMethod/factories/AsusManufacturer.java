package designPatterns.creational.abstractFactoryMethod.factories;

import designPatterns.creational.abstractFactoryMethod.products.AsusGpu;
import designPatterns.creational.abstractFactoryMethod.products.Gpu;
import designPatterns.creational.abstractFactoryMethod.products.Monitor;
import designPatterns.creational.abstractFactoryMethod.products.AsusMonitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
