package com.ab.creational.singleton.threadsafe;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    //1
//    public synchronized static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    //2
//    public static Singleton getInstance() {
//        synchronized (Singleton.class) {
//            if (singleton == null) {
//                singleton = new Singleton();
//            }
//            return singleton;
//        }
//    }

    //double checked locking
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
