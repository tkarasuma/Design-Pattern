import java.util.Random;

public class RandomIntegerGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    private  int max;

    public RandomIntegerGenerator(int max) {
        this.max = max;
    }

    public int getNumber()
    {
        return number;
    }
    public void run() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(max);
            System.out.println(String.format("発生した乱数: %2d", number));
            notifyObservers();
            System.out.println();
        }
    }
}
