// <single command> ::= go | right | left | flash
public class SingleCommand extends Node {
    private String name;
    public void parse(Context context) throws ParseException {
        name = context.current();
        context.skip(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")&& !name.equals("flash")){
            throw new ParseException("\""+name + "\" というコマンドは未定義です。");
        }
    }
    public String toString(){
        String str ="";
        switch (name){
            case "go" :
                str = "「 ロボ、進め！！」 「 ガオーーッ！！」\n";
                break;
            case "left" :
                str = "「 ロボ、左折しろ！！」 「 ガオーーッ！！」\n";
                break;
            case "right" :
                str = "「 ロボ、右折しろ！！」 「 ガオーーッ！！」\n";
                break;
            case "flash" :
                str = "「 ロボ、閃光弾を発射！！」 「 バシューーッ！！」\n";
                break;
        }
        return str;
    }
}
