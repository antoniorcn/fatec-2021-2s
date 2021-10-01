package edu.curso;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculadora extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane panPrincipal = new BorderPane();
        GridPane panBotoes = new GridPane();
        FlowPane panDisplay = new FlowPane();

        panPrincipal.setTop(panDisplay);
        panPrincipal.setCenter(panBotoes);

        panBotoes.setVgap(5);
        panBotoes.setHgap(5);

        BorderPane.setMargin(panBotoes, new Insets(20));
        BorderPane.setMargin(panDisplay, new Insets(20));

        panDisplay.setHgap(5);

        ColumnConstraints colCons = new ColumnConstraints();
        colCons.setPercentWidth(25);
        panBotoes.getColumnConstraints().addAll(
                colCons, colCons, colCons, colCons);

        RowConstraints rowCons = new RowConstraints();
        rowCons.setPercentHeight(25);
        panBotoes.getRowConstraints().addAll(
                rowCons, rowCons, rowCons, rowCons);

        TextField txtDisplay = new TextField("0");
        txtDisplay.setStyle("-fx-control-inner-background:cyan;");
        txtDisplay.setPrefHeight(40);
        txtDisplay.setPrefColumnCount(14);
        panDisplay.getChildren().add(txtDisplay);
        panDisplay.getChildren().add(new Button("CE"));

        String[] botoes = {"1", "2", "3", "+", "4", "5", "6", "-",
        "7", "8", "9", "*", ".", "0", "=", "/"};

        int col = 0;
        int lin = 0;
        for (int i = 0; i < botoes.length; i++) {
            Button btn = new Button(botoes[i]);
            btn.setMaxWidth(Double.MAX_VALUE);
            btn.setMaxHeight(Double.MAX_VALUE);
            panBotoes.add(btn, col, lin);
            col++;
            if (col >= 4) {
                lin++;
                col = 0;
            }
        }

        Scene scn = new Scene(panPrincipal, 300, 600);

        stage.setScene(scn);

        stage.setTitle("Calculadora");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Calculadora.class, args);
    }
}
