public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public  abstract void componentMethod();
    protected abstract void displayList(String path);

    protected  void displayList(){
        this.displayList("");
    }

    public  void add(Component component){
        try {
            throw  new Exception("Component.add Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return this.name;
    }
}
