package lk.acpt.demofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.acpt.demofx.HelloApplication;

import java.io.IOException;

public class LoginViewController {
    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private AnchorPane root;

    @FXML
    void login(ActionEvent event) throws IOException {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        Stage stage = (Stage) this.root.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Home Page");
        stage.setScene(scene);
    }
}
