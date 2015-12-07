import java.util.Iterator;

public class Visitor_On_The_Way extends Visitor {
    private String current_Pos = "";

    public void visit(Leaf leaf) {
        System.out.println(current_Pos + "/" + leaf);
    }

    public void visit(Node node) {
        System.out.println(current_Pos + "/" + node);
        String temp_Pos = current_Pos;
        current_Pos = current_Pos + "/" + node.getName();
        Iterator it = node.iterator();
        while (it.hasNext()) {
            Entity entity = (Entity) it.next();
            entity.accept(this);
        }
        current_Pos = temp_Pos;
    }
}
