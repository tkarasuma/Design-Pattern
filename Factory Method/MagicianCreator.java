public abstract class MagicianCreator {
    public  abstract  Magician factoryMethod(String name);
    public  final Magician create(String name){
        Magician magician =  factoryMethod(name);
        return magician;
    }
}
