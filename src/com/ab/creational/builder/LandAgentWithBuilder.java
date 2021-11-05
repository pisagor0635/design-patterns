package com.ab.creational.builder;

public class LandAgentWithBuilder {
    public static void main(String[] args) {

        HomeBuilder homeBuilder = new HomeBuilder();
        Home home = homeBuilder.startBuild().setCity("İzmir")
                .setDistrinct("Özdere")
                .setBuildingYear(1998)
                .setNumberOfRoom(5)
                .setNumberOfBathroom(3)
                .setHasCarpark(true)
                .setHasAirCondition(false)
                .build();

        Home homeWithMustField = homeBuilder.startBuildWithMustFieldAndSwimmingPool("Ankara", "Çankaya", "Cevizlidere")
                .setBuildingYear(2015)
                .setHasCarpark(true)
                .build();

        System.out.println(home);
        System.out.println("******************************************************************************************");
        System.out.println(homeWithMustField);

    }
}
