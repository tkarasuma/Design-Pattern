public class BlackMagician extends Magician {

    public BlackMagician(String name) {
        super(name);
    }
    @Override
    public void magic_A() {
        System.out.println("黒魔術 Aパターン");
    }

    @Override
    public void magic_B() {
        System.out.println("黒魔術 Bパターン");
    }
}
