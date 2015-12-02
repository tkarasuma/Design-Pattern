public class BlackMagicianCreator extends MagicianCreator {
    @Override
    public Magician factoryMethod(String name) {
        return new BlackMagician(name);
    }
}
