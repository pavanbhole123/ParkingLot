package repository;

import Models.Gate;
import Models.ParkingLot;
import Exception.PakingLotNotFoundException;
import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate>gateHashMap;

    public GateRepository() {
        this.gateHashMap = new HashMap<>();
    }
    public Gate get(int gateId){
        Gate gate = gateHashMap.get(gateId);
        if (gate == null){
            throw new PakingLotNotFoundException("Gate for given ID not Found: " +gateId);
        }
        return gate;
    }
    public void put(Gate gate){
        gateHashMap.put(gate.getId(), gate);
        System.out.println("gate Added Successfully");
    }
}

