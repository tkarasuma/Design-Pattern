import java.util.HashMap;

public class NinjaFactory {
    private HashMap<String,Ninja> list = new HashMap<>();
    // シングルトンパターン
    private  static NinjaFactory singleton = new NinjaFactory();
    //シングルトンパターンではこのprivateが重要
    private NinjaFactory(){
    }
    public  static  NinjaFactory getInstance(){
        return  singleton;
    }
    //
    public  synchronized  Ninja getNinja(String name){
        Ninja ninja = list.get(name);
        if (ninja == null) {
            ninja = new Ninja(name); // ここでBigCharのインスタンスを生成
            list.put(name, ninja);
        }
        return  ninja;
    }
}
