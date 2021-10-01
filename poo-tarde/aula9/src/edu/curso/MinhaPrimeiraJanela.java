package edu.curso;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class MinhaPrimeiraJanela extends Application {
    @Override
    public void start(Stage stage) {
        Pane pan = new Pane();
        Scene scn = new Scene(pan, 800.0, 600.0);

        Label lblHelloWorld = new Label("Hello World");
        lblHelloWorld.relocate(380.0, 250.0);

        Button btnOk = new Button("Ok");
        btnOk.relocate(400.0, 300.0);

        // pan.getChildren().add(lblHelloWorld);
        // pan.getChildren().add(btnOk);
        pan.getChildren().addAll(lblHelloWorld, btnOk);

        stage.setScene(scn);
        stage.setTitle("Minha primeira Janela");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(MinhaPrimeiraJanela.class, args);
    }
}
