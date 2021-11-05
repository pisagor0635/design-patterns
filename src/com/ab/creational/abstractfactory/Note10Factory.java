package com.ab.creational.abstractfactory;

public class Note10Factory implements PhoneFactory {
    @Override
    public Phone getPhone(String model, String battery, int height, int width) {
        return new Note10(model, battery, height, width);
    }
}
