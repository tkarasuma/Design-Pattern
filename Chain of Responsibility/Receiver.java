public abstract class Receiver{
    private  String name;
    private  Receiver next;

    public Receiver(String name) {
        this.name = name;
    }

    public Receiver setNext(Receiver next) {
        this.next = next;
        return  next;
    }

    public void receive(NumberBody numberBody) {
        if (isPossible(numberBody)) {
            done(numberBody);
        } else if (next != null) {
            next.receive(numberBody);
        } else {
            fail(numberBody);
        }
    }

    @Override
    public String toString() {
        return "Receiver{name=" + name +'}';
    }

    protected void done(NumberBody numberBody) {
        System.out.println(numberBody + "は" + this + "によって解決されました。");
    }
    protected  abstract boolean isPossible(NumberBody numberBody);

    protected void fail(NumberBody numberBody) {
        System.out.println(numberBody + "は解決されませんでした。");
    }
}
