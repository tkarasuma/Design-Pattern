import java.util.Iterator;
import java.util.ArrayList;

public class Node extends Entity {
    private String name;
    private ArrayList<Entity> children_List = new ArrayList();

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        int weight = 0;
        Iterator it = children_List.iterator();
        while (it.hasNext()) {
            Entity entity = (Entity) it.next();
            weight += entity.getWeight();
        }
        return weight;
    }

    public Entity add(Entity entity) {
        children_List.add(entity);
        return this;
    }

    public Iterator iterator() {
        return children_List.iterator();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
