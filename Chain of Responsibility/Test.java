public class Test {
    public static void main(String[] args) {
        Receiver no_number = new NoNumberReceiver("扱える数字なし");
        Receiver less_than_10_number = new LessThanWhatReceiver("10以下の数字" ,10);
        Receiver only_36 = new SpecificNumberReceiver("36を補足",36);
        Receiver less_than_20_number = new LessThanWhatReceiver("20以下の数字" ,20);
        Receiver even_number = new EvenNumberReceiver("偶数補足");
        Receiver less_than_50_number = new LessThanWhatReceiver("50以下の数字" ,50);

        no_number.setNext(less_than_10_number).setNext(only_36).setNext(less_than_20_number).setNext(even_number).setNext(less_than_50_number);

        for (int i = 0; i <= 100;  i += 3) {
            no_number.receive(new NumberBody(i));
        }
    }
}
