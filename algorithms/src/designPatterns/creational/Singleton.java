package designPatterns.creational;

/*
                Singleton Design Pattern

- should be used when a class must have a single instance available
- disables all means of creating objects of a class except for the
special static creation method which returns the existing instance
if it has already been created
- its code needs to be adapted to handle multiple threads
- let you access your object from anywhere in your application
- guarantee that only one instance of this class will be available
at any point in time
*/
public class Singleton {

    // volatile - ensures that multiple threads will able to handle Singleton instance correctly
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        // by using this local var can improve the method overall performance by as much as 40%
        Singleton result = instance;
        // skipping synchronization when retrieving an already-created instance
        if (result == null) {
            // prevents two threads from accessing this piece of code at the same time
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }

        return result;
    }

    // public method to get data
    public String getData() {
        return data;
    }
}
