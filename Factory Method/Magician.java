public abstract class Magician {
    String name;
    public Magician(String name) {
        this.name = name;
        System.out.println("魔法使い、"+name + "参上～");
    }
    public  abstract  void magic_A();
    public  abstract  void magic_B();
}
