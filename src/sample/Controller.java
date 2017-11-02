package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.*;


public class Controller {
    public TextField textfield;
    public Label label;
    public Button button;

    public void handleClick(ActionEvent actionEvent) {
        textfield.setText("Kliknięto.");
    }
    Button button = new Button("Przycisk");
    button.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            handleClick(button.getText());
        }
}
}
