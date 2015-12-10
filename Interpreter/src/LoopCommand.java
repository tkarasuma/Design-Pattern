// <loop command> ::= loop <count> <command list>
public class LoopCommand extends Node {
    private int count;
    private Node commandList;
    public void parse(Context context) throws ParseException {
        context.skip("loop");
        count = context.getCount();
        context.next();
        commandList = new CommandList();
        commandList.parse(context);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(commandList );
        }

        return  sb.toString();
    }
}
