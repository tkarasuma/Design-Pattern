package sample;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;

public class LoginPane extends GridPane implements Mediator{

    private RadioButton radio_Anonymous;
    private RadioButton radio_Login;
    private MateToggleGroup group;
    private MateTextField textfield_User;
    private MatePasswordField textfield_Password;
    private MateButton btn_OK;
    private MateButton btn_Cancel;

    public LoginPane() {

        super();
        this.setStyle("-fx-background-color: lightgray");

        createMates();

        this.add(radio_Anonymous,0,0);
        this.add(radio_Login,1,0);
        this.add(new Label("ユーザー名"),0,1);
        this.add(textfield_User,1,1);
        this.add(new Label("パスワード"),0,2);
        this.add(textfield_Password,1,2);
        this.add(btn_OK,0,3);
        this.add(btn_Cancel,1,3);

        mateChanged();

    }

    @Override

    public void createMates() {

        group = new MateToggleGroup();

        radio_Anonymous = new RadioButton("匿名");
        radio_Anonymous.setSelected(true);
        radio_Anonymous.setToggleGroup(group);
        radio_Login = new RadioButton("ログイン");
        radio_Login.setToggleGroup(group);
        textfield_User = new MateTextField("", 10);
        textfield_Password = new MatePasswordField(10);
        btn_OK = new MateButton("OK");
        btn_Cancel = new MateButton("キャンセル");

        group.setMediator(this);
        textfield_User.setMediator(this);
        textfield_Password.setMediator(this);
        btn_OK.setMediator(this);
        btn_Cancel.setMediator(this);

    }

    public void mateChanged() {
        if (radio_Anonymous.isSelected()) {
            textfield_User.setMateEnabled(false);
            textfield_Password.setMateEnabled(false);
            btn_OK.setMateEnabled(true);
        } else {
            textfield_User.setMateEnabled(true);
            passwordChanged();
        }
    }

    private void passwordChanged() {
        if (textfield_User.getText().length() > 0) {
            textfield_Password.setMateEnabled(true);
            if (textfield_Password.getText().length() > 0) {
                //System.out.println("u>0,p>0,OK>0");
                btn_OK.setMateEnabled(true);
            } else {
               // System.out.println("u>0,p<0,OK<0");
                btn_OK.setMateEnabled(false);
            }
        } else {
            //System.out.println("u<0, p<0, OK <0 ");
            textfield_Password.setMateEnabled(false);
            btn_OK.setMateEnabled(false);
        }
    }


}
