public class Test {
    private Strategy strategy = null;
    public static void main(String[] args) {
        Sample s1 = new Sample("サンプルA", 13,25,56);
        Sample s2 = new Sample("サンプルB", 17,25,42);
        System.out.println("Param1_Strategy戦略を採用したTestインスタンスを生成");
        Test t1 = new Test(new Param1_Strategy());
        t1.strategy.compare(s1,s2);
        System.out.println();
        System.out.println("Param2_Strategy戦略を採用したTestインスタンスを生成");
        Test t2 = new Test(new Param2_Strategy());
        t2.strategy.compare(s1,s2);
        System.out.println();
        System.out.println("Param3_Strategy戦略を採用したTestインスタンスを生成");
        Test t3 = new Test(new Param3_Strategy());
        t3.strategy.compare(s1,s2);
    }
    public Test(Strategy strategy) {
        this.strategy = strategy;
    }

}
