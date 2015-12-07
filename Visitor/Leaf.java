public class Leaf extends Entity {

    private String name;
    private int weight;

    public Leaf(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
