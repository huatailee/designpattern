package io.ht.designpattern.creational.singleton;

public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton singleton;
    private DoubleCheckedLockingSingleton(){

    }
    public static DoubleCheckedLockingSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
