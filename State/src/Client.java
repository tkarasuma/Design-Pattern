import java.util.Random;

public class Client{
    public static void main(String[] args){
        Random rand = new Random();
        Context context = new Context();

        int input;

        for (int i = 1; i <= 10; i++){
            input = rand.nextInt(2);
            System.out.print(String.format("%2d回目: %d を入力   ", i, input) );
            context.goNext(input);
        }
    }
}