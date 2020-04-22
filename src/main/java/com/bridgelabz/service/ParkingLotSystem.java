package com.bridgelabz.service;

import com.bridgelabz.utility.AirportSecurity;
import com.bridgelabz.utility.Owner;

import java.util.HashMap;

public class ParkingLotSystem {

    private final int parkingCapacity;
    Integer counter=0;
    HashMap<Integer, Object> map = new HashMap<>();

    public ParkingLotSystem(int parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }

    public boolean park(Object vehicle) {
        if(map.size() == parkingCapacity){
            Owner.parkingLotInfo = "Parking lot is full";
            AirportSecurity.parkingLotInfo = "Parking lot is full";
        }
        map.put(counter,vehicle);
        counter++;
        return true;
    }

    public boolean unPark(Object vehicle) {
        if (map.containsValue(vehicle)){
            map.remove(vehicle);
            return true;
        }
        return false;
    }
}
