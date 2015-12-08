package sample;

        import javafx.application.Platform;
        import javafx.scene.control.Button;

public class MateButton extends Button implements Mate {
    private Mediator mediator;
    public MateButton(String caption) {
        super(caption);
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        this.setOnAction(event -> Platform.exit());
    }
    public void setMateEnabled(boolean enabled) {
        this.setDisable(!enabled);
    }
}
