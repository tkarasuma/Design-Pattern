public class HogeMotors extends Factory{
    @Override
    public Car createCar(String str) {
        return new Car(str + " made by Hoge");
    }
 
    @Override
    public Truck createTruck(String str) {
        return new Truck(str + " made by Hoge");
    }
}