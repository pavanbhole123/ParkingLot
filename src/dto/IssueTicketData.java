package dto;

import Models.vehicleType;

public class IssueTicketData {
    private String VehicleNUmber;
    private int gateId;
    private String color;
    private vehicleType type;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    private  String make;
    public String getVehicleNUmber() {
        return VehicleNUmber;
    }

    public void setVehicleNUmber(String vehicleNUmber) {
        VehicleNUmber = vehicleNUmber;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int  gateId) {
        this.gateId = gateId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public vehicleType getType() {
        return type;
    }

    public void setType(vehicleType type) {
        this.type = type;
    }
}
