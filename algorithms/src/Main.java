import designPatterns.creational.Singleton;

public class Main {

    public static Singleton singleton = Singleton.getInstance("test");
    public static void main(String[] args) {

        System.out.println(singleton.getData());
    }
}