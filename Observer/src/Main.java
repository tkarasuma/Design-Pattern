public class Main {
    public static void main(String[] args) {

        NumberGenerator generator = new RandomIntegerGenerator(100);

        Observer observer1 = new EvenNumberObserver();
        Observer observer2 = new FiftyAndOver_Observer();
        Observer observer3 = new DividedBy3_Observer();

        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);

        generator.run();
    }
}
