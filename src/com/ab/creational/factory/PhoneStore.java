package com.ab.creational.factory;

public class PhoneStore {
    public static void main(String[] args) {
        Phone phone1 = PhoneFactory.getPhone("S10", "1200mA", 8, 5);
        Phone phone2 = PhoneFactory.getPhone("Note10", "2000mA", 11, 9);

        System.out.println(phone1);
        System.out.println(phone2);

        Phone phone3 = PhoneFactory.getPhone("Note11", "2500mA", 12, 10);

    }
}