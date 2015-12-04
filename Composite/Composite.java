import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends  Component {

    private ArrayList<Component> component_list = new ArrayList();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void componentMethod() {

        System.out.println("Composite#componentMethod:"+this);
    }
    public void add(Component component) {
        component_list.add(component);
    }
    @Override
    protected void displayList(String path ) {

        System.out.println(path +  "/"  + this);
        Iterator it = component_list.iterator();
        while (it.hasNext()) {
            Component component = (Component)it.next();
            component.displayList(path +  "/"  + this);
        }
    }
}
