package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;


public class MateTextField extends TextField implements ChangeListener, Mate {
    private Mediator mediator;
    public MateTextField(String text, int columns) {
        super(text);
        this.setPrefColumnCount(columns);
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        this.textProperty().addListener(this);
    }
    public void setMateEnabled(boolean enabled) {
        this.setDisable(!enabled);
        this.setStyle("-fx-background-color:"+ (enabled ? "white" : "lightgray"));
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        mediator.mateChanged();
    }
}
