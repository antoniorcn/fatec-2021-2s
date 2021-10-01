package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ExemploBorderPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pan = new BorderPane();
        Scene scn = new Scene(pan, 600, 300);


        Button btnTop = new Button("Top");
        btnTop.setPrefWidth(1000.0);
        Button btnLeft = new Button("Left");
        btnLeft.setPrefHeight(1000.0);
        Button btnRight = new Button("Right");
        btnRight.setPrefHeight(1000.0);
        Button btnBottom = new Button("Bottom");
        btnBottom.setPrefWidth(1000.0);
        Button btnCenter = new Button("Center");

        pan.setTop(btnTop);
        pan.setBottom(btnBottom);
        pan.setLeft(btnLeft);
        pan.setRight(btnRight);
        pan.setCenter(btnCenter);

        stage.setScene(scn);
        stage.show();
    }
}
