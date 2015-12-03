public class ProxyFighter implements  Fightable{
    private  String name;
    private  RealFighter real_one;
    public ProxyFighter(String name) {
        this.name = name;
    }

    @Override
    public void setFighterName(String name) {
        if (real_one != null) {
            real_one.setFighterName(name);  // 「本人」にも設定する
        }
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(this.name+"(自称) :  どっからでもかかってきなさい！！");
    }

    @Override
    public void fight() {
        System.out.println(this.name+"(自称) : あ、本番？!  担当のもの呼びますんで、少々お待ちを…。");
        if (real_one == null) {
            real_one = new RealFighter(name);
            real_one.fight();
        }
    }
}
