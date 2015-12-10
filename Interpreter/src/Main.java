import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // ファイルはクラスパスからの相対パスにすること。
            BufferedReader reader = new BufferedReader(new FileReader("out\\production\\Interpreter\\program.txt"));
            String str;

            while ((str = reader.readLine()) != null) {
                System.out.println("指示命令 = \"" + str + "\"\n");
                Node node = new Program();
                node.parse(new Context(str));
                System.out.println("【 ロボ、起動  】");
                System.out.println(node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
