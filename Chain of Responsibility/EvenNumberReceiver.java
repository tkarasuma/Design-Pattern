public class EvenNumberReceiver extends Receiver {
    public EvenNumberReceiver(String name) {
        super(name);
    }
    protected boolean isPossible(NumberBody numberBody) {
        if (numberBody.getNumber() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
