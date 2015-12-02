public class Test {
    public static void main(String[] args) {
        MagicianCreator creator = new BlackMagicianCreator();
        Magician magician = creator.factoryMethod("闇乃");
        magician.magic_A();
        magician.magic_B();

        creator= new WhiteMagicianCreator();
        Magician magician_2 = creator.factoryMethod("白雪");
        magician_2.magic_A();
        magician_2.magic_B();

    }
}
