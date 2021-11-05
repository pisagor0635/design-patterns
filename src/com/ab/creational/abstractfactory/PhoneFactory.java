package com.ab.creational.abstractfactory;

public interface PhoneFactory {
    Phone getPhone(String model, String battery, int height, int width);
}
