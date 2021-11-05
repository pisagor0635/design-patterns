package com.ab.creational.singleton.eagerloading;

public class App {
    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        if (singletonA.equals(singletonB)) {
            System.out.println("Same");
        } else {
            System.out.println("NotSame");
        }
    }
}
