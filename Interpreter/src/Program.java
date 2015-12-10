// <program> ::= program <command list>
public class Program extends Node {
    private Node commandList;
    public void parse(Context context) throws ParseException {
        context.skip("program");
        commandList = new CommandList();
        commandList.parse(context);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("【 行動開始 】\n");
        sb.append(commandList);
        sb.append("【 行動終了 】\n");
        return sb.toString();
    }
}
