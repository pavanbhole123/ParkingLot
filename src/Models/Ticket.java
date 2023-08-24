package Models;

import java.time.LocalDateTime;

public class Ticket extends baseModel {
    private LocalDateTime entry_time;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public LocalDateTime getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(LocalDateTime entry_time) {
        this.entry_time = entry_time;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
