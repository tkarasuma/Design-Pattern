public class WhiteMagicianCreator extends MagicianCreator {
    @Override
    public Magician factoryMethod(String name) {
        return new WhiteMagician(name);
    }
}
