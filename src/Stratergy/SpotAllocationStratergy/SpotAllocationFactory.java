package Stratergy.SpotAllocationStratergy;

import repository.ParkingLotRepository;

public class SpotAllocationFactory {
    public static spotAllocationStartergy getSpot(ParkingLotRepository parkingLotRepository){
        return new RandomSpotAllocationStratergy(parkingLotRepository);
    }
}
