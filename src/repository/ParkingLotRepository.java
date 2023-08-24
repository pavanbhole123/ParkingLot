package repository;

import Models.Gate;
import Models.ParkingLot;
import Exception.PakingLotNotFoundException;
import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot>parkingLotHashMap;

    public ParkingLotRepository() {
        this.parkingLotHashMap = new HashMap<>();
    }
    public ParkingLot get(int pakingLotId){
        ParkingLot parkingLot = parkingLotHashMap.get(pakingLotId);
        if (parkingLot == null){
            throw new PakingLotNotFoundException("Parkign for given ID not Found: " +pakingLotId);
        }
            return parkingLot;
    }
    public void put(ParkingLot parkingLot){
        parkingLotHashMap.put(parkingLot.getId(),parkingLot);
        System.out.println("Parking Lot Added Successfully");
    }
    public ParkingLot getParkingLot(Gate gate){
        int  parkingLotId = gate.getParkingLotId();
        ParkingLot parkingLot = parkingLotHashMap.get(parkingLotId);
        if (parkingLot == null){
            throw new PakingLotNotFoundException("Parkign for given ID not Found: " +parkingLotId);
        }
        return parkingLot;
    }
}

