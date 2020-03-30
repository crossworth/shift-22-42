package br.com.crossworth.shift2242;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField input;

    @FXML
    private Button encrypt;

    @FXML
    private Button decrypt;

    @FXML
    private TextArea result;

    @FXML
    public void onEncryptAction() {
        if (input.getText().length() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Você deve digitar um texto");
            alert.show();
            return;
        }

        result.appendText(Shift2242.encrypt(input.getText()) + "\n");
    }

    @FXML
    public void onDecryptAction() {
        if (input.getText().length() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Você deve digitar um texto");
            alert.show();
            return;
        }

        result.appendText(Shift2242.decrypt(input.getText()) + "\n");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        result.setEditable(false);
    }
}
