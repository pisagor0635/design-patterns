package com.ab.creational.singleton.lazyloading;

public class App {
    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        if (singletonA.equals(singletonB)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
