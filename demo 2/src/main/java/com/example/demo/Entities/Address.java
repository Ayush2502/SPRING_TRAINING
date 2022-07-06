package com.example.demo.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

  private  String landmark;
    private String house_no;
    private String state;
    private String city;
    private String pin;

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Address(String landmark, String house_no, String state, String city, String pin) {
        this.landmark = landmark;
        this.house_no = house_no;
        this.state = state;
        this.city = city;
        this.pin = pin;
    }

    public Address() {
        super();
    }

    @Override
    public String toString() {
        return "Address{" +
                "landmark='" + landmark + '\'' +
                ", house_no='" + house_no + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
