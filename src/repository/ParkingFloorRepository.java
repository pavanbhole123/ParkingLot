package repository;

import Models.ParkingFloor;
import Exception.PakingLotNotFoundException;
import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor>parkingFloorHashMap;

    public ParkingFloorRepository() {
        this.parkingFloorHashMap = new HashMap<>();
    }
    public ParkingFloor get(int pakinFloorId){
        ParkingFloor parkingFloor = parkingFloorHashMap.get(pakinFloorId);
        if (parkingFloor == null){
            throw new PakingLotNotFoundException("Parking Floor for given ID not Found: " +pakinFloorId);
        }
        return parkingFloor;
    }
    public void put(ParkingFloor ParkingFloor){
        parkingFloorHashMap.put(ParkingFloor.getId(),ParkingFloor);
        System.out.println("Parking Floor Added Successfully");
    }
}

