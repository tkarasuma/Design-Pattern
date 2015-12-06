package drawer;

import command.Command;
import javafx.geometry.Point2D;

public class DrawCommand implements Command {

    protected Drawable drawable;
    private Point2D position;

    public DrawCommand(Drawable drawable, Point2D position) {
        this.drawable = drawable;
        this.position = position;
    }

    public void execute() {
        System.out.println(position.getX() +":"+position.getY() );
        drawable.draw(position.getX(), position.getY());
    }
}
