package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ToggleGroup;

public class MateToggleGroup extends ToggleGroup implements ChangeListener, Mate {
    private Mediator mediator;

    public MateToggleGroup() {

    }

    public void setMediator(Mediator mediator) {
         this.mediator = mediator;
        this.selectedToggleProperty().addListener(this);
    }

    @Override
    public void setMateEnabled(boolean enabled) {

    }


    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        mediator.mateChanged();
    }
}
