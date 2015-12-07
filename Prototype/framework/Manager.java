package framework;
import java.util.*;

public class Manager {
    private HashMap type = new HashMap();
    public void register(String name, Prototype prototype){
        type.put(name, prototype);
    }
    public Prototype create(String name) {
        Prototype prototype = (Prototype) type.get(name);
        return prototype.createClone();
    }
}
