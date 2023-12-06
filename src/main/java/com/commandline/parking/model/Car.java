package com.commandline.parking.model;

public class Car {
    private Long id;
    private String registrationNumber;
    private String colour;
    public Car(Long id, String registrationNumber, String colour) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.colour = colour;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
