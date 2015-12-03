public class Test {
    public static void main(String[] args) {
       Fightable proxy = new ProxyFighter("天下無双戦士");
        proxy.speak();
        proxy.setFighterName("無敵超人");
        proxy.speak();
        System.out.println("#######リアルバウト開始######");
        proxy.fight();
        proxy.speak();
    }
}
