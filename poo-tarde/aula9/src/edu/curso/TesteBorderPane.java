package edu.curso;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TesteBorderPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pan = new BorderPane();
        Scene scn = new Scene(pan, 600, 400);

        Label lblTop = new Label("Top");
        pan.setTop(new Label("Top"));

        pan.setBottom(new Label("Bottom"));
        pan.setCenter(new Label("Center"));
        pan.setLeft(new Label("Left"));
        pan.setRight(new Label("Right"));

        stage.setScene(scn);
        stage.setTitle("BorderPane Teste");
        stage.show();

    }
}
