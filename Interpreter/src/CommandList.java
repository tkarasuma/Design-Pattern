import java.util.ArrayList;
import java.util.Iterator;

// <command list> ::= <command>* end
public class CommandList extends Node {
    private ArrayList list = new ArrayList();
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.current() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.current().equals("end")) {
                context.skip("end");
                break;
            } else {
                Node commandNode = new Command();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next());
        }
        return sb.toString();
    }
}
