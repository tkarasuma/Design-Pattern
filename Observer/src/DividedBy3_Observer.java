public class DividedBy3_Observer implements Observer {
    public void update(NumberGenerator generator) {
        int num = generator.getNumber();
        if (num%3 ==0){
            System.out.println("FiftyAndOver_Observer: : 3の倍数、発見");
        }
    }
}
