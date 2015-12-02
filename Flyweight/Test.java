import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("桜"));
        list.add("雷");
        list.add("岩");
        list.add("風");
        list.add("雲");
        list.add("菊");
        list.add("嵐");
        list.add("炎");
        list.add("林");
        list.add("山");
        list.add("風");
        list.add("雲");
        list.add("嵐");
        list.add("炎");
        list.add("雷");
        list.add("雷");

        NinjaSentai sentai = new NinjaSentai(list.toArray(new  String[0]));
        sentai.display();

    }
}
