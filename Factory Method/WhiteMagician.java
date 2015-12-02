public class WhiteMagician extends Magician {

    public WhiteMagician(String name) {
                super(name);
    }
    @Override
    public void magic_A() {
        System.out.println("白魔術 Aパターン");
    }

    @Override
    public void magic_B() {
        System.out.println("白魔術 Bパターン");
    }
}
