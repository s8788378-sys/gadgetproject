package gadgetproject;
public class GadgetMain {
    public static void main(String[] args) { 
        Gadget myPhone = new Phone("Apple", 85.0, 128); 
        myPhone.showInfo(); 
        myPhone.turnOn();
        ((Phone) myPhone).charge();
        
    System.out.println("-------------------------");

    Gadget myWatch = new Watch("Samsung", 60.0, true);
    myWatch.showInfo();
    myWatch.turnOn();

    System.out.println("-------------------------");

    Gadget myEarbuds = new Earbuds("Sony", 90.0, true);
    myEarbuds.showInfo();
    myEarbuds.turnOn();
}
}