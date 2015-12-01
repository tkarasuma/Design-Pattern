
public class Test {
    public static void main(String[] args) {
        Magic magic_1 = new Magic(new BlackMagic());
        Magic magic_2 = new Magic(new WhiteMagic());
        magic_1.magicalMethod();
        magic_2.magicalMethod();
        ScientificMagic magic_3 = new ScientificMagic(new BlackMagic());
        magic_3.magicalMethod();
        magic_3.addScienceMethod();
    }
}
