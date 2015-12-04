public class LessThanWhatReceiver extends Receiver {
    private   int THRESHOLD = 5;
    public LessThanWhatReceiver(String name , int threshold){
        super(name);
        this.THRESHOLD = threshold;
    }
    protected boolean isPossible(NumberBody numberBody) {
        if (numberBody.getNumber() < THRESHOLD) {
            return true;
        } else {
            return false;
        }
    }
}
