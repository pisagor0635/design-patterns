package com.ab.creational.builder;

public class Home {

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

    public Home() {
    }

    public Home(String city, String distrinct, String neighborhood, int buildingYear, int numberOfBalcony, int numberOfRoom, int numberOfBathroom, int numberOfWC, boolean isDublex, boolean isFurnished, boolean hasCarpark, boolean hasChildPark, boolean hasAirCondition, boolean hasSwimmingPool) {
        this.city = city;
        this.distrinct = distrinct;
        this.neighborhood = neighborhood;
        this.buildingYear = buildingYear;
        this.numberOfBalcony = numberOfBalcony;
        this.numberOfRoom = numberOfRoom;
        this.numberOfBathroom = numberOfBathroom;
        this.numberOfWC = numberOfWC;
        this.isDublex = isDublex;
        this.isFurnished = isFurnished;
        this.hasCarpark = hasCarpark;
        this.hasChildPark = hasChildPark;
        this.hasAirCondition = hasAirCondition;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrinct() {
        return distrinct;
    }

    public void setDistrinct(String distrinct) {
        this.distrinct = distrinct;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
    }

    public int getNumberOfBalcony() {
        return numberOfBalcony;
    }

    public void setNumberOfBalcony(int numberOfBalcony) {
        this.numberOfBalcony = numberOfBalcony;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBathroom() {
        return numberOfBathroom;
    }

    public void setNumberOfBathroom(int numberOfBathroom) {
        this.numberOfBathroom = numberOfBathroom;
    }

    public int getNumberOfWC() {
        return numberOfWC;
    }

    public void setNumberOfWC(int numberOfWC) {
        this.numberOfWC = numberOfWC;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasCarpark() {
        return hasCarpark;
    }

    public void setHasCarpark(boolean hasCarpark) {
        this.hasCarpark = hasCarpark;
    }

    public boolean isHasChildPark() {
        return hasChildPark;
    }

    public void setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
    }

    public boolean isHasAirCondition() {
        return hasAirCondition;
    }

    public void setHasAirCondition(boolean hasAirCondition) {
        this.hasAirCondition = hasAirCondition;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", distrinct='" + distrinct + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", buildingYear=" + buildingYear +
                ", numberOfBalcony=" + numberOfBalcony +
                ", numberOfRoom=" + numberOfRoom +
                ", numberOfBathroom=" + numberOfBathroom +
                ", numberOfWC=" + numberOfWC +
                ", isDublex=" + isDublex +
                ", isFurnished=" + isFurnished +
                ", hasCarpark=" + hasCarpark +
                ", hasChildPark=" + hasChildPark +
                ", hasAirCondition=" + hasAirCondition +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
