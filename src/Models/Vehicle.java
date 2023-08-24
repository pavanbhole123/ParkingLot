package Models;

public class Vehicle {
    private String number;
    private String name;
    private String make;
    private vehicleType type;
    private String color;

    public Vehicle( String number, String make, vehicleType type, String color) {
        this.number = number;
        this.make = make;
        this.type = type;
        this.color = color;
    }

    public Vehicle() {
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public vehicleType getType() {
        return type;
    }

    public void setType(vehicleType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
