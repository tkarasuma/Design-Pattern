public class FiftyAndOver_Observer implements Observer {
    public void update(NumberGenerator generator) {
        int num = generator.getNumber();
        if (num >= 50){
            System.out.println("FiftyAndOver_Observer: : 50以上の整数、発見");
        }
    }
}
