package Models;

public class Gate extends baseModel{
    private int gate_no;
    private int floor_no;
    private GateType gateType;
    private Status status;
    private String operator;
    private int parkingLotId;

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getGate_no() {
        return gate_no;
    }

    public void setGate_no(int gate_no) {
        this.gate_no = gate_no;
    }

    public int getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(int floor_no) {
        this.floor_no = floor_no;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
