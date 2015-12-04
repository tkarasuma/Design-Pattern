public class SpecificNumberReceiver extends Receiver {
    private int SpecificNumber;
    public SpecificNumberReceiver(String name, int number) {
        super(name);
        this.SpecificNumber = number;
    }
    protected boolean isPossible(NumberBody numberBody) {
        if (numberBody.getNumber() == SpecificNumber) {
            return true;
        } else {
            return false;
        }
    }
}
