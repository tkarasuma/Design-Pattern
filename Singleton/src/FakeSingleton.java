public class FakeSingleton {

    private FakeSingleton() {
        System.out.println("FakeSingleton コンストラクター起動");
    }

    public static FakeSingleton getInstance()
    {
        return new  FakeSingleton();
    }
}
