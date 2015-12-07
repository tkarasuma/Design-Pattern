public class Main {
    public static void main(String[] args) {

        System.out.println("ツリー構築");
        Node root = new Node("ルート");
        Node node_A = new Node("ノードＡ");
        Node node_B = new Node("ノードＢ");
        Node node_C = new Node("ノードＣ");
        Node node_D = new Node("ノードＤ");
        root.add(node_A);
        root.add(node_B);
        root.add(node_C);
        root.add(node_D);
        root.add(new Leaf("葉Ｒ１", 30));
        node_A.add(new Leaf("葉Ａ１", 10));
        node_A.add(new Leaf("葉Ａ２", 20));
        node_A.add(new Leaf("葉Ａ３", 20));
        node_D.add(new Leaf("葉Ｂ１", 20));
        root.accept(new Visitor_On_The_Way());

        System.out.println("");
        System.out.println("ツリー更新");
        Node node_X = new Node("ノードＸ");
        Node node_Y = new Node("ノードＹ");
        Node node_Z = new Node("ノードＺ");
        node_C.add(node_X);
        node_C.add(node_Y);
        node_C.add(node_Z);
        node_X.add(new Leaf("葉Ｘ１", 40));
        node_X.add(new Leaf("葉Ｘ２", 50));
        node_Y.add(new Leaf("葉Ｙ１", 30));
        node_Z.add(new Leaf("葉Ｚ１", 40));
        node_Z.add(new Leaf("葉Ｚ２", 20));
        node_Z.add(new Leaf("葉Ｚ３", 30));
        root.accept(new Visitor_On_The_Way());

    }
}
