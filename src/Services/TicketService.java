package Services;

import Models.*;
import Stratergy.SpotAllocationStratergy.RandomSpotAllocationStratergy;
import Stratergy.SpotAllocationStratergy.SpotAllocationFactory;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import Stratergy.SpotAllocationStratergy.spotAllocationStartergy;
import  Models.vehicleType;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
    }
    public Ticket getTicket(vehicleType type,String vehicleNumber,String vehicleColor,String vehicleMake,int GateID ){
        Gate gate = gateRepository.get(GateID);
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(gate);
        spotAllocationStartergy SpotAllocationStatergy = SpotAllocationFactory.getSpot(parkingLotRepository);
        ParkingSpot parkingSpot = SpotAllocationStatergy.getSpot(type,gate);
        parkingSpot.setStatus(Status.NOT_AVAILABLE);

        Ticket ticket = new Ticket();
        ticket.setVehicle(new Vehicle(vehicleNumber,vehicleMake,type,vehicleColor));
        ticket.setEntry_time(LocalDateTime.now());
        ticket.setParkingSpot(parkingSpot);
        return ticket;
    }
}
