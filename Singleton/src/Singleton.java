public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton()
    {
        System.out.println("Singleton コンストラクター起動");
    }
    public static Singleton getInstance() {
        if (singleton==null){
            System.out.println("singletonはnull: singleton.hashCode()="+singleton.hashCode());
        }else{
            System.out.println("singletonは実体を持つ: singleton.hashCode()="+singleton.hashCode());
        }
        return singleton;
    }
}
