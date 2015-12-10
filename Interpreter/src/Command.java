// <command> ::= <loop command> | <single command>
public class Command extends Node {
    private Node node;
    public void parse(Context context) throws ParseException {
        if (context.current().equals("loop")) {
            node = new LoopCommand();
            node.parse(context);
        } else {
            node = new SingleCommand();
            node.parse(context);
        }
    }
    public String toString(){
        return node.toString();
    }
}
