/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.serializableJson;

import java.util.Objects;

/**
 * Default constructor is needed here for json object mapper to work!
 */
public class Vehicle {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && Objects.equals(plateNumber, vehicle.plateNumber) && Objects.equals(latitude, vehicle.latitude) && Objects.equals(longitude, vehicle.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, latitude, longitude, speed);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", speed=" + speed +
                '}';
    }
}
