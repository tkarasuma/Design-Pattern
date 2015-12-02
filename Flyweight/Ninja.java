public class Ninja {
    private String name;
    public Ninja(String name) {
        this.name = name;
    }
    public  void display(){
        System.out.println(String.format("%12s", this.hashCode()) +" : "+this.name+"ニンジャーッ！！(ポーズ)" );
    }
}
