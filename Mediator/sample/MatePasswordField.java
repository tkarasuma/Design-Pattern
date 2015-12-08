package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.PasswordField;


public class MatePasswordField extends PasswordField implements ChangeListener, Mate {
    private Mediator mediator;
    public MatePasswordField(int columns) {
        super();
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
