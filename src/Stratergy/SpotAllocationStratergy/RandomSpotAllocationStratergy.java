package Stratergy.SpotAllocationStratergy;

import Models.*;
import repository.ParkingLotRepository;

public class RandomSpotAllocationStratergy  implements  spotAllocationStartergy{
    private ParkingLotRepository parkingLotRepository;
    public RandomSpotAllocationStratergy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository=parkingLotRepository;
    }
    @Override
    public ParkingSpot getSpot(vehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(gate);
        int currentFloor = gate.getFloor_no();
        ParkingFloor parkingFloor = parkingLot.getParkingFloors().get(currentFloor-1);
        for( ParkingSpot parkingSpot:parkingFloor.getParkingSpots()){
            if(parkingSpot.getSupported_vehicle().equals(vehicleType)&&parkingSpot.getStatus().equals(Status.AVAILABLE)){
                return parkingSpot;
            }
        }
        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            for( ParkingSpot parkingSpot:floor.getParkingSpots()){
                if(parkingSpot.getSupported_vehicle().equals(vehicleType)&&parkingSpot.getStatus().equals(Status.AVAILABLE)){
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
