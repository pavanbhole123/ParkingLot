package Services;



import Models.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRespository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private GateRepository gateRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRespository parkingSpotRepository;
    private ParkingLotRepository parkingLotRepository;


    public InitialisationService() {
        this.gateRepository = new GateRepository();
        this.parkingFloorRepository = new ParkingFloorRepository();
        this.parkingSpotRepository = new ParkingSpotRespository();
        this.parkingLotRepository = new ParkingLotRepository();
    }

    /***
     *  This will create a parking lot with 10 floors, and each floor having 10 spots
     *  @return ParkingLot object
     */
    public ParkingLot initialise(){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setStatus(Status.ACTIVE);
        parkingLot.setAddress("Road A, City C, State S");
        parkingLot.setCapacity(100);

        Gate entryGate = new Gate();
        entryGate.setId(1);
        entryGate.setOperator("Ram Kumar");
        entryGate.setGate_no(1);
        entryGate.setGateType(GateType.ENTRY_GATE);
        entryGate.setFloor_no(1);
        entryGate.setStatus(Status.ACTIVE);

        Gate exitGate = new Gate();
        exitGate.setId(2);
        exitGate.setOperator("Mohan Kumar");
        exitGate.setGate_no(2);
        exitGate.setGateType(GateType.EXIT_GATE);
        exitGate.setFloor_no(1);
        exitGate.setStatus(Status.ACTIVE);
        List<Gate>newGates=new ArrayList<>();
        newGates.add(exitGate);
        newGates.add(entryGate);
        parkingLot.setGates(newGates);
        gateRepository.put(entryGate);
        gateRepository.put(exitGate);

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for(int i=1;i<=10;i++){
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(100 + i);
            parkingFloor.setStatus(Status.ACTIVE);
            parkingFloor.setFloorNo(i);
            for(int j=1;j<=10;j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(1000+j);
                parkingSpot.setParking_number(i*100+j);
                if(j%2==0){
                    parkingSpot.setSupported_vehicle(vehicleType.TwoWheeler);
                } else {
                    parkingSpot.setSupported_vehicle(vehicleType.FourWheeler);
                }
                parkingSpot.setStatus(Status.AVAILABLE);
                parkingSpots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingSpots);
            parkingFloorRepository.put(parkingFloor);
            parkingFloors.add(parkingFloor);
        }
        parkingLot.setParkingFloors(parkingFloors);
        parkingLotRepository.put(parkingLot);
        return parkingLot;
    }
}
