package com.bridgelabz.service;

public class ParkingLotSystem {

    private Object vehicle;

    public boolean park(Object vehicle) {
        this.vehicle = vehicle;
        return vehicle != null;
    }

    public boolean unPark(Object vehicle) {
        return this.vehicle == vehicle;
    }
}
