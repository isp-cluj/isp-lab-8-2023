/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.workTrucksMonitoring.model;

import java.util.Objects;

/**
 *
 * @author mihai.hulea
 */

public class Truck {
    private double latitude;
    private double longitudel;
    private String plateNumber;

    public Truck() {
    }

    public Truck(double latitude, double longitudel, String plateNumber) {
        this.latitude = latitude;
        this.longitudel = longitudel;
        this.plateNumber = plateNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitudel() {
        return longitudel;
    }

    public void setLongitudel(double longitudel) {
        this.longitudel = longitudel;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Truck other = (Truck) obj;
        if (!Objects.equals(this.plateNumber, other.plateNumber)) {
            return false;
        }
        return true;
    }


}
