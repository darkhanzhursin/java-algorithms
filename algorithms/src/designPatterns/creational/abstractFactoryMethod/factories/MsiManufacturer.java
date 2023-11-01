package designPatterns.creational.abstractFactoryMethod.factories;

import designPatterns.creational.abstractFactoryMethod.products.Gpu;
import designPatterns.creational.abstractFactoryMethod.products.Monitor;
import designPatterns.creational.abstractFactoryMethod.products.MsiGpu;
import designPatterns.creational.abstractFactoryMethod.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
