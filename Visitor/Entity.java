import java.util.Iterator;

public abstract class Entity implements Host {
    public abstract String getName();

    public abstract int getWeight();

    public Entity add(Entity entity) throws Exception {
        throw new Exception("Entity#add 例外発生");
    }

    public Iterator iterator() throws Exception {
        throw new Exception("Entity#iterator 例外発生");
    }

    public String toString() {
        return getName() + " (" + getWeight() + ")";
    }
}
