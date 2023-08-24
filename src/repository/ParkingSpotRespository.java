package repository;

import Models.ParkingSpot;
import Exception.ParkingSpotNotFoundException;
import java.util.HashMap;

public class ParkingSpotRespository {
    private HashMap<Integer,ParkingSpot> parkingSpotMap;

    public ParkingSpotRespository() {
        this.parkingSpotMap = new HashMap<>();
    }
    public ParkingSpot get(int parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot==null){
            throw new ParkingSpotNotFoundException("ParkingSpotnotFound with given id ");
        }
        return parkingSpot;
    }
    public void put(ParkingSpot parkingSpot){
        parkingSpotMap.put(parkingSpot.getId(),parkingSpot);
        System.out.println("Parking Spot is added Successfully");
    }
}
