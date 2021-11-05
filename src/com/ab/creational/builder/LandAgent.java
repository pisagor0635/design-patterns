package com.ab.creational.builder;

public class LandAgent {
    public static void main(String[] args) {

        Home home = new Home();
        home.setCity("Ankara");
        home.setDublex(true);

        printHomeDetails(home);

    }

    private static void printHomeDetails(Home home) {

        System.out.println("Home Details :");
        System.out.println(home);
    }
}
