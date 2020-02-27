package com.example.bccServer.models;
import javax.persistence.*;

@Entity
@Table(name="bccsurvey")
public class answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String lightRoastScore;
    private String mediumRoastScore;
    private String darkRoastScore;
    private String roastPreference;
    private String coffeeTypePreference;
    private String bccRoastPreference;
    private String mostImportantFlavor;

    public answer(String lightRoastScore, String mediumRoastScore, String darkRoastScore, String roastPreference, String coffeeTypePreference, String bccRoastPreference, String mostImportantFlavor) {
        this.lightRoastScore = lightRoastScore;
        this.mediumRoastScore = mediumRoastScore;
        this.darkRoastScore = darkRoastScore;
        this.roastPreference = roastPreference;
        this.coffeeTypePreference = coffeeTypePreference;
        this.bccRoastPreference = bccRoastPreference;
        this.mostImportantFlavor = mostImportantFlavor;
    }

    public String getLightRoastScore() {
        return lightRoastScore;
    }

    public void setLightRoastScore(String lightRoastScore) {
        this.lightRoastScore = lightRoastScore;
    }

    public String getMediumRoastScore() {
        return mediumRoastScore;
    }

    public void setMediumRoastScore(String mediumRoastScore) {
        this.mediumRoastScore = mediumRoastScore;
    }

    public String getDarkRoastScore() {
        return darkRoastScore;
    }

    public void setDarkRoastScore(String darkRoastScore) {
        this.darkRoastScore = darkRoastScore;
    }

    public String getRoastPreference() {
        return roastPreference;
    }

    public void setRoastPreference(String roastPreference) {
        this.roastPreference = roastPreference;
    }

    public String getCoffeeTypePreference() {
        return coffeeTypePreference;
    }

    public void setCoffeeTypePreference(String coffeeTypePreference) {
        this.coffeeTypePreference = coffeeTypePreference;
    }

    public String getBccRoastPreference() {
        return bccRoastPreference;
    }

    public void setBccRoastPreference(String bccRoastPreference) {
        this.bccRoastPreference = bccRoastPreference;
    }

    public String getMostImportantFlavor() {
        return mostImportantFlavor;
    }

    public void setMostImportantFlavor(String mostImportantFlavor) {
        this.mostImportantFlavor = mostImportantFlavor;
    }
}
