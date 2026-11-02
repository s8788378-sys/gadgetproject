package gadgetproject;
public class Phone extends Gadget implements Chargeable { 
    int storage;
public Phone(String brand, double batteryLevel, int storage) {
    super(brand, batteryLevel);
    this.storage = storage;
}

@Override
public void turnOn() {
    System.out.println("Phone screen turned on.");
}

@Override
public void charge() {
    System.out.println("Phone is charging.");
}
}