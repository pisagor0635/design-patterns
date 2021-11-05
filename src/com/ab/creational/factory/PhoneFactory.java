package com.ab.creational.factory;

public class PhoneFactory {

    public static Phone getPhone(String model, String battery, int height, int width) {
        Phone phone;
        if (model.equalsIgnoreCase("S10")) {
            phone = new S10(model, battery, height, width);

        } else if (model.equalsIgnoreCase("Note10")) {
            phone = new Note10(model, battery, height, width);

        } else {
            throw new RuntimeException("There is no such phone model!");
        }
        return phone;
    }
}