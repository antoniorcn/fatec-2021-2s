package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculadora extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String[] nomesBotoes = {"1", "2", "3", "+", "4", "5", "6", "-",
        "7", "8", "9", "*", ".", "0", "=", "/"};

        BorderPane panPrincipal = new BorderPane();
        GridPane panBotoes = new GridPane();
        FlowPane panDisplay = new FlowPane();
        TextField txtDisplay = new TextField("0");
        txtDisplay.setStyle(
                "-fx-control-inner-background: blue; -fx-padding: 10; -fx-min-width: 21em; -fx-min-height: 5em;");
        panDisplay.getChildren().add(txtDisplay);
        panDisplay.getChildren().add(new Button("CE"));

        panPrincipal.setCenter(panBotoes);
        panPrincipal.setTop(panDisplay);

        panBotoes.setHgap(5);
        panBotoes.setVgap(5);

        ColumnConstraints colConstraint = new ColumnConstraints();
        colConstraint.setPercentWidth(25);
        panBotoes.getColumnConstraints().addAll(
                colConstraint, colConstraint, colConstraint, colConstraint);

        RowConstraints rowConstraint = new RowConstraints();
        rowConstraint.setPercentHeight(25);
        panBotoes.getRowConstraints().addAll(
                rowConstraint, rowConstraint, rowConstraint, rowConstraint);

//        panBotoes.add(new Button("1"), 0, 0);
//        panBotoes.add(new Button("2"), 1, 0);
//        panBotoes.add(new Button("3"), 2, 0);
//        panBotoes.add(new Button("+"), 3, 0);
//
//        panBotoes.add(new Button("4"), 0, 1);
//        panBotoes.add(new Button("5"), 1, 1);
//        int col = 0;
//        int lin = 0;
        for(int i = 0; i < nomesBotoes.length; i++) {
            int lin = i / 4;
            int col = i % 4;
            Button btn = new Button( nomesBotoes[i] );
            btn.setMaxWidth(Double.MAX_VALUE);
            btn.setMaxHeight(Double.MAX_VALUE);
            panBotoes.add(btn, col, lin);
//            col++;
//            if (col >= 4) {
//                col = 0;
//                lin++;
//            }
        }

        // 0  1  2  3
        // 4  5  6  7
        // 8  9  10 11
        // 12 13 14 15

        // i == 8     col = 0    lin = 2
        // i == 5     col = 1    lin = 1
        // i == 11    col = 3    lin = 2
        // i == 12    col = 0    lin = 3

        // lin = i / 4 (apenas o valor inteiro)
        // col = i % 4 (o resto)

        Scene scn = new Scene(panPrincipal, 400, 600);

        stage.setScene(scn);
        stage.setTitle("Calculadora");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Calculadora.class, args);
    }
}
