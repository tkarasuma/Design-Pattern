public class Politician  extends Person implements  Leader{
    public Politician(String name) {
        super(name);
    }
    @Override
    public void doLeaderJob_1() {
        doOwnJob_1();
    }
    @Override
    public void doLeaderJob_2() {
        doOwnJob_2();
    }
}
