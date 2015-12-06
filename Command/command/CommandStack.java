package command;

import java.util.Stack;
import java.util.Iterator;

public class CommandStack implements Command {
    private Stack stack = new Stack();

    public void execute() {
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((Command) it.next()).execute();
        }
        System.out.println("");
    }

    public void append(Command command) {
        if (command != this) {
            stack.push(command);
        }
    }

    public void undo() {
        if (!stack.empty()) {
            stack.pop();
        }
    }

    public void clear() {
        stack.clear();
    }
}
