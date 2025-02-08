package com.example.lalana;

public class Destination {
    private String destination;
    private String axe;
    private String frais;
    private String distance;

    public Destination(String destination, String axe, String frais, String distance) {
        this.destination = destination;
        this.axe = axe;
        this.frais = frais;
        this.distance = distance;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAxe() {
        return axe;
    }

    public void setAxe(String axe) {
        this.axe = axe;
    }

    public String getFrais() {
        return frais;
    }

    public void setFrais(String frais) {
        this.frais = frais;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
