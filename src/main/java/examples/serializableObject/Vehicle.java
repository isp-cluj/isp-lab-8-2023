/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.serializableObject;

import java.io.Serializable;


//!!! We use lombok project to generate constructor
public class Vehicle implements Serializable {
    private String plateNumber;
    private String latitude;
    private String longitude;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(String plateNumber, String latitude, String longitude, int speed) {
        this.plateNumber = plateNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
