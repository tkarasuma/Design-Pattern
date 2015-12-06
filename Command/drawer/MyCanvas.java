package drawer;

import command.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCanvas extends Canvas implements Drawable {
    private final GraphicsContext gc;
    private final Color color = Color.RED;
    private final int radius = 5;
    private final int diameter = radius * 2;

    private CommandStack stack;

    public MyCanvas(int width, int height, CommandStack stack) {
        super(width, height);
        gc = getGraphicsContext2D();
        gc.setFill(color);
        this.stack = stack;
    }

    public void update() {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 400, 400);
        gc.setFill(color);
        stack.execute();
    }

    @Override
    public void draw(double x, double y) {
        gc.fillOval(x - radius, y - radius, diameter, diameter);
    }
}
