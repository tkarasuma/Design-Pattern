public class RealFighter implements Fightable {
    private  String name;

    public RealFighter(String name) {
        this.name = name;
    }

    @Override
    public void setFighterName(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println("真の戦士、"+ this.name +": 真の戦士、"+name+"の力、とくとご覧じろ！！");
    }

    @Override
    public void speak() {
        System.out.println("真の戦士、"+ this.name +": どこからでもかかってらっしゃい。");
    }
}
