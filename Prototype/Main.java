import framework.*;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.register("白角柱タイプ", new PillarStyle('□', 3));
        manager.register("白丸柱タイプ", new PillarStyle('○', 5));
        manager.register("黒角塊タイプ", new RockStyle('■', 5));
        manager.register("黒丸塊タイプ", new RockStyle('●', 6));

        Prototype type_1 = manager.create("白角柱タイプ");
        type_1.run("高床式倉庫");
        Prototype type_2 = manager.create("白丸柱タイプ");
        type_2.run("林冠観測所");
        type_2.run("物見櫓");
        Prototype type_3 = manager.create("黒角塊タイプ");
        type_3.run("霞ヶ関ビル");
        Prototype type_4 = manager.create("黒丸塊タイプ");
        type_4.run("ランドマークタワー");

    }
}
