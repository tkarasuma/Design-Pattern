import java.util.Scanner;
 
public class Test {
 
    public static void main(String[] args) {
        Factory factory = null;
        while(factory==null){
            factory = Factory.getFactory(selectBrand());
        }
        Car car = factory.createCar("スポーツカー");
        car.run();
        Truck truck = factory.createTruck("軽トラ");
        truck.run();
    }
    public  static String selectBrand(){
        System.out.println("HogeMotorsとFugaMotors、どちらのブランドにしますか？");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
 
}