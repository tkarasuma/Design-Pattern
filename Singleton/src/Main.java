public class Main {
    public static void main(String[] args) {

        //このタイミングのときだけ、コンストラクター起動
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(Singleton.getInstance().hashCode());

        System.out.println();
        System.out.println("偽のSingleton");
        System.out.println();


        FakeSingleton fake1 = FakeSingleton.getInstance();
        FakeSingleton fake2 = FakeSingleton.getInstance();

        if (fake1 == fake2) {
            System.out.println("fake1 == fake2");
        } else {
            System.out.println("fake1 != fake2");
        }

        System.out.println(fake1.hashCode());
        System.out.println(fake2.hashCode());
        System.out.println(FakeSingleton.getInstance().hashCode());

    }
}
