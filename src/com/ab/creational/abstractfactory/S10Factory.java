package com.ab.creational.abstractfactory;

public class S10Factory implements PhoneFactory {
    @Override
    public Phone getPhone(String model, String battery, int height, int width) {
        return new S10(model, battery, height, width);
    }
}
