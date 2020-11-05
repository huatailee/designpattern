package io.ht.designpattern.creational.singleton;

public class IdeaSingleton {
    private static IdeaSingleton ourInstance = new IdeaSingleton();

    public static IdeaSingleton getInstance() {
        return ourInstance;
    }

    private IdeaSingleton() {
    }
}
