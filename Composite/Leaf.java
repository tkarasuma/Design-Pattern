public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void componentMethod() {
        System.out.println("Leaf#componentMethod:"+this);
    }

    @Override
    protected void displayList(String path) {
        System.out.println(path + "/" + this);
    }
}
