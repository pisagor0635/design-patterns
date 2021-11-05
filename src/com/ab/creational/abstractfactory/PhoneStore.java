package com.ab.creational.abstractfactory;

public class PhoneStore {
    public static void main(String[] args) {
        S10Factory s10Factory = new S10Factory();
        Phone s10 = s10Factory.getPhone("S10", "2500mA", 8, 6);

        Note10Factory note10Factory = new Note10Factory();
        Phone note10 = note10Factory.getPhone("Note10", "3200mA", 10, 7);

        System.out.println(s10);
        System.out.println(note10);

    }
}
