package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Tela extends Application {

    @Override
    public void start(Stage stage) {
        Pane pan = new Pane();
        Scene scn = new Scene(pan, 600, 400);

        Label lblHello = new Label("Hello World Java FX");
        Button btnOk = new Button("Ok");
        lblHello.relocate(200, 200);

        // pan.getChildren().add(lblHello);
        // pan.getChildren().add(btnOk);
        pan.getChildren().addAll(lblHello, btnOk);

        stage.setScene(scn);
        stage.setTitle("Minha primeira aplicação");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Tela.class, args);
    }
}
