package sample;

import command.*;
import drawer.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private CommandStack commandStack = new CommandStack();
    private MyCanvas canvas = new MyCanvas(400, 400, commandStack);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        Button btn_clear = new Button("clear");
        btn_clear.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn_clear.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        commandStack.clear();
                        canvas.update();
                    }
                }
        );
        Button btn_undo = new Button("undo");
        btn_undo.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn_undo.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        commandStack.undo();
                        canvas.update();
                    }
                }
        );

        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        Command cmd = new DrawCommand(canvas, new Point2D(e.getX(), e.getY()));
                        commandStack.append(cmd);
                        cmd.execute();
                    }
                });

        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        Command cmd = new DrawCommand(canvas, new Point2D(e.getX(), e.getY()));
                        commandStack.append(cmd);
                        cmd.execute();
                    }
                });


        pane.setTop(btn_clear);
        pane.setCenter(canvas);
        pane.setBottom(btn_undo);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("タイトル");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
