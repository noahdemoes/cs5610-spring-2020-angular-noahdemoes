package com.example.bccServer.models;

public class answer {
    private String bootstrapslider1;
    private String bootstrapslider2;
    private String bootstrapslider3;
    private String brewMethod;
    private String coffeeTake;
    private String position;
    private String coffeeRank;
    private String roastPreference;
    private String flavors;

    public answer(String bootstrapslider1) {
        this.bootstrapslider1 = bootstrapslider1;
    }

    public answer() {
    }

    public answer(String bootstrapslider1, String bootstrapslider2, String bootstrapslider3, String brewMethod, String coffeeTake, String position, String coffeeRank, String roastPreference, String flavors) {
        this.bootstrapslider1 = bootstrapslider1;
        this.bootstrapslider2 = bootstrapslider2;
        this.bootstrapslider3 = bootstrapslider3;
        this.brewMethod = brewMethod;
        this.coffeeTake = coffeeTake;
        this.position = position;
        this.coffeeRank = coffeeRank;
        this.roastPreference = roastPreference;
        this.flavors = flavors;
    }

    public String getBootstrapslider1() {
        return bootstrapslider1;
    }

    public void setBootstrapslider1(String bootstrapslider1) {
        this.bootstrapslider1 = bootstrapslider1;
    }

    public String getBootstrapslider2() {
        return bootstrapslider2;
    }

    public void setBootstrapslider2(String bootstrapslider2) {
        this.bootstrapslider2 = bootstrapslider2;
    }

    public String getBootstrapslider3() {
        return bootstrapslider3;
    }

    public void setBootstrapslider3(String bootstrapslider3) {
        this.bootstrapslider3 = bootstrapslider3;
    }

    public String getBrewMethod() {
        return brewMethod;
    }

    public void setBrewMethod(String brewMethod) {
        this.brewMethod = brewMethod;
    }

    public String getCoffeeTake() {
        return coffeeTake;
    }

    public void setCoffeeTake(String coffeeTake) {
        this.coffeeTake = coffeeTake;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCoffeeRank() {
        return coffeeRank;
    }

    public void setCoffeeRank(String coffeeRank) {
        this.coffeeRank = coffeeRank;
    }

    public String getRoastPreference() {
        return roastPreference;
    }

    public void setRoastPreference(String roastPreference) {
        this.roastPreference = roastPreference;
    }

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }
}
