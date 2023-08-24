package Stratergy.SpotAllocationStratergy;

import Models.Gate;
import Models.ParkingSpot;
import Models.vehicleType;

public interface spotAllocationStartergy {
    public  ParkingSpot getSpot(vehicleType vehicleType, Gate gate);
}
