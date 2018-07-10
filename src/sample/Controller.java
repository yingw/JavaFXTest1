package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label hello;

    public void sayHello(ActionEvent actionEvent) {
        hello.setText("Hello!");
    }

    public void byebye(ActionEvent actionEvent) {
        System.exit(0);
    }
}
