public class Test {
    public static void main(String[] args) {
        Magician magician_1 = new WhiteMagician("ホワイトネス");
        Magician magician_2 = new BlackMagician("ダークネス");

        System.out.println();

        magician_1.showAllMagic();

        System.out.println();

        magician_2.showAllMagic();
    }
}