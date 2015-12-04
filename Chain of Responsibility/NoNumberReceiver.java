public class NoNumberReceiver extends Receiver {
    public NoNumberReceiver(String name) {
        super(name);
    }
    protected boolean isPossible(NumberBody numberBody) {
        return false; //常に失敗
    }
}
