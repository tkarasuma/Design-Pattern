public class FugaMotors extends Factory{
    @Override
    public Car createCar(String str) {
        return new Car(str + " made by Fuga");
    }
 
    @Override
    public Truck createTruck(String str) {
        return new Truck(str + " made by Fuga");
    }
}