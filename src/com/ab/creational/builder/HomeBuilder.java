package com.ab.creational.builder;

public class HomeBuilder {
    private String city;
    private String distrinct;
    private String neighborhood;

    private int buildingYear;
    private int numberOfBalcony;
    private int numberOfRoom;
    private int numberOfBathroom;
    private int numberOfWC;

    private boolean isDublex;
    private boolean isFurnished;
    private boolean hasCarpark;
    private boolean hasChildPark;
    private boolean hasAirCondition;
    private boolean hasSwimmingPool;

    public Home build() {
        Home home = new Home();

        home.setCity(city);
        home.setDistrinct(distrinct);
        home.setNeighborhood(neighborhood);

        home.setBuildingYear(buildingYear);
        home.setNumberOfBalcony(numberOfBalcony);
        home.setNumberOfRoom(numberOfRoom);
        home.setNumberOfBathroom(numberOfBathroom);
        home.setNumberOfWC(numberOfWC);

        home.setDublex(isDublex);
        home.setFurnished(isFurnished);
        home.setHasCarpark(hasCarpark);
        home.setHasChildPark(hasChildPark);
        home.setHasAirCondition(hasAirCondition);
        home.setHasSwimmingPool(hasSwimmingPool);

        return home;
    }

    public HomeBuilder startBuild() {
        return new HomeBuilder();
    }

    public HomeBuilder startBuildWithMustFieldAndSwimmingPool(String city, String distrinct, String neighborhood) {
        this.setCity(city);
        this.setDistrinct(distrinct);
        this.setNeighborhood(neighborhood);
        this.setHasSwimmingPool(true);
        return this;
    }


    public HomeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HomeBuilder setDistrinct(String distrinct) {
        this.distrinct = distrinct;
        return this;
    }

    public HomeBuilder setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public HomeBuilder setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
        return this;
    }

    public HomeBuilder setNumberOfBalcony(int numberOfBalcony) {
        this.numberOfBalcony = numberOfBalcony;
        return this;
    }

    public HomeBuilder setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
        return this;
    }

    public HomeBuilder setNumberOfBathroom(int numberOfBathroom) {
        this.numberOfBathroom = numberOfBathroom;
        return this;
    }

    public HomeBuilder setNumberOfWC(int numberOfWC) {
        this.numberOfWC = numberOfWC;
        return this;
    }

    public HomeBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public HomeBuilder setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public HomeBuilder setHasCarpark(boolean hasCarpark) {
        this.hasCarpark = hasCarpark;
        return this;
    }

    public HomeBuilder setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
        return this;
    }

    public HomeBuilder setHasAirCondition(boolean hasAirCondition) {
        this.hasAirCondition = hasAirCondition;
        return this;
    }

    public HomeBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }
}
