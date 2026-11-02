package gadgetproject;
public abstract class Gadget {
    protected String brand;
    protected double batteryLevel;
public Gadget(String brand, double batteryLevel) {
    this.brand = brand;
    this.batteryLevel = batteryLevel;
}

public abstract void turnOn();

public void showInfo() {
    System.out.println("Brand: " + brand + " | Battery: " + batteryLevel + "%");
}
}
