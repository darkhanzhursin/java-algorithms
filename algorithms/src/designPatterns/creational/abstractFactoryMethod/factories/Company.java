package designPatterns.creational.abstractFactoryMethod.factories;

import designPatterns.creational.abstractFactoryMethod.products.Gpu;
import designPatterns.creational.abstractFactoryMethod.products.Monitor;

/*
*           Abstract Factory Method
*
*  - allow you to produce families of related objects
* without specifying their concrete classes.
*
* - use it when your code needs to work with various families
* of related products.
* - many designs start by using the Factory Method Pattern
* and later evolve toward an Abstract Factory Design.
* - follows the open-closed and single responsibility principles
* - centralizes the product creation code in one place in the program
* */
public abstract class Company {

    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
