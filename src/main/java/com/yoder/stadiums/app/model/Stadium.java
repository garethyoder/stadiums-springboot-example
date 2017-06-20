package com.yoder.stadiums.app.model;

import java.io.Serializable;

/**
 * Created by Gareth Yoder on 6/19/2017.
 */
public class Stadium implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer stadiumID;
    private String name;
    private String city;
    private String state;
    private String country;
    private Integer capacity;
    private String playingSurface;
    private Integer geoLat;
    private Integer geoLong;

    public Integer getStadiumID() {
        return stadiumID;
    }

    public void setStadiumID(Integer stadiumID) {
        this.stadiumID = stadiumID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getPlayingSurface() {
        return playingSurface;
    }

    public void setPlayingSurface(String playingSurface) {
        this.playingSurface = playingSurface;
    }

    public Integer getGeoLat() {
        return geoLat;
    }

    public void setGeoLat(Integer geoLat) {
        this.geoLat = geoLat;
    }

    public Integer getGeoLong() {
        return geoLong;
    }

    public void setGeoLong(Integer geoLong) {
        this.geoLong = geoLong;
    }
}
