package gadgetproject;
public class Earbuds extends Gadget { 
    boolean hasBluetooth;
public Earbuds(String brand, double batteryLevel, boolean hasBluetooth) {
    super(brand, batteryLevel);
    this.hasBluetooth = hasBluetooth;
}

@Override
public void turnOn() {
    System.out.println("Earbuds connected.");
}
}