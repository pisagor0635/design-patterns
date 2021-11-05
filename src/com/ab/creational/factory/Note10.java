package com.ab.creational.factory;

public class Note10 implements Phone {
    String model;
    String battery;
    int height;
    int width;

    public Note10(String model, String battery, int height, int width) {
        this.model = model;
        this.battery = battery;
        this.height = height;
        this.width = width;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBattery() {
        return null;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public String toString() {
        return "Note10{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}