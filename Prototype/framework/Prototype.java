package framework;
import java.lang.Cloneable;

public interface Prototype extends Cloneable {
    void run(String str);
    Prototype createClone();
}
