public class EvenNumberObserver implements Observer {
    public void update(NumberGenerator generator) {
        int num = generator.getNumber();
        if (num%2 ==0){
            System.out.println("EvenNumberObserver : 偶数、発見");
        }
    }
}
