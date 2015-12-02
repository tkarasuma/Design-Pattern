public class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("\""+ this.name + "\" loads and transports !!");
    }
}