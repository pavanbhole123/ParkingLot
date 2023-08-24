package Models;

public class ParkingSpot extends baseModel {
    private int parking_number;
    private Status status;
    private Vehicle vehicle;
    private vehicleType supported_vehicle;

    public int getParking_number() {
        return parking_number;
    }

    public void setParking_number(int parking_number) {
        this.parking_number = parking_number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public vehicleType getSupported_vehicle() {
        return supported_vehicle;
    }

    public void setSupported_vehicle(vehicleType supported_vehicle) {
        this.supported_vehicle = supported_vehicle;
    }
}
