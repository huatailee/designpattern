package io.ht.designpattern.creational.singleton;

public class HolderSingleton {
    private static class SingletonHolder{
        private static final HolderSingleton singleton = new HolderSingleton();
    }
    private HolderSingleton(){}
    public static final HolderSingleton getInstance(){
        return SingletonHolder.singleton;
    }
}
