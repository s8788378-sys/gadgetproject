package gadgetproject;
public class Watch extends Gadget { 
    boolean isDigital;
public Watch(String brand, double batteryLevel, boolean isDigital) {
    super(brand, batteryLevel);
    this.isDigital = isDigital;
}

@Override
public void turnOn() {
    System.out.println("Watch screen turned on.");
}
}
