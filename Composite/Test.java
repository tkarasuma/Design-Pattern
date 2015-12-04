public class Test {
    public static void main(String[] args) {

        Component composite_Root = new Composite("ルートノード");

        Component composite_A = new Composite("Aノード");
        Component composite_B = new Composite("Bノード");
        Component composite_C = new Composite("Cノード");

        composite_Root.add(composite_A);
        composite_Root.add(composite_B);
        composite_Root.add(composite_C);

        composite_A.add(new Leaf("葉-A1"));
        composite_A.add(new Leaf("葉-A2"));

        composite_B.add(new Leaf("葉-B1"));
        composite_B.add(new Leaf("葉-B2"));
        composite_B.add(new Leaf("葉-B3"));

        Component leaf_R0 = new Leaf("葉-R0");

        //LeafにLeafを追加すると、Componentクラスにある自作のExceptionが出る。
       // leaf_R0.add(new Leaf("葉-R0-葉"));
        composite_Root.add(leaf_R0);
        composite_Root.add(new Leaf("葉-R1"));
        composite_Root.add(new Leaf("葉-R2"));

        composite_Root.displayList();

        System.out.println("使ってみましょう。");
        leaf_R0.componentMethod();
        composite_B.componentMethod();


    }
}
