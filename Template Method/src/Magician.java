public abstract class Magician {
    String name;
    public Magician(String name) {
        this.name = name;
        System.out.println("魔法使い、"+name + "参上～");
    }
    public  abstract  void magic_A();
    public  abstract  void magic_B();
    public final void showAllMagic() {
        System.out.println(this.name + "の魔術ショー開始");
        this.magic_A();
        this.magic_B();
        System.out.println("ありがとうございました。");
    }
}