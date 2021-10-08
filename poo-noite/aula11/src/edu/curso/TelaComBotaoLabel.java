package edu.curso;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.*;

class TesteHandle implements EventHandler<ActionEvent> {
    Label lblTeste;

    @Override
    public void handle(ActionEvent e) {
        // System.out.println("Botão pressionado");
        if (e.getTarget() instanceof Button) {
            Button btn = (Button) e.getTarget();
            if (btn.getText().equals("Ok")) {
                lblTeste.setText("Botão Ok pressionado");
            } else if (btn.getText().equals("Outro")) {
                lblTeste.setText("Outro botão foi pressionado");
            }
        }
    }
}

public class TelaComBotaoLabel extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane panPrincipal = new BorderPane();
        Scene scn = new Scene(panPrincipal, 400, 200);

        Label lblTexto = new Label("Label");
        Button btnOk = new Button("Ok");
        Button btnOutro = new Button("Outro");
        panPrincipal.setRight(btnOutro);

        BorderPane.setAlignment(lblTexto, Pos.CENTER);
        BorderPane.setAlignment(btnOk, Pos.CENTER);

        // 1ª Forma de fazer, criando uma classe externa com o código para ser
        // executado quando o botão for pressionado
//        TesteHandle handle = new TesteHandle();
//        handle.lblTeste = lblTexto;
//        btnOk.addEventFilter(ActionEvent.ANY, handle);
//        btnOutro.addEventFilter(ActionEvent.ANY, handle);

        // 2ª Forma, fazendo uma classe anônima
//        EventHandler<ActionEvent> handle = new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent e) {
//                lblTexto.setText("Algum botão foi pressionado");
//            }
//        };
//
//        btnOk.addEventFilter(ActionEvent.ANY, handle);
//        btnOutro.addEventFilter(ActionEvent.ANY, handle);

        // 3ª Forma, fazendo uma classe anônima sem variável de referencia
//        btnOk.addEventFilter(ActionEvent.ANY, new EventHandler<ActionEvent>(){
//            @Override
//            public void handle(ActionEvent e) {
//                lblTexto.setText("Botão Ok foi apertado");
//            }
//        });
//
//        btnOutro.addEventFilter(ActionEvent.ANY, new EventHandler<ActionEvent>(){
//            @Override
//            public void handle(ActionEvent e) {
//                lblTexto.setText("Botão Outro foi apertado");
//            }
//        });

        // 4ª Forma, uso do Lambda
//        btnOk.addEventHandler(ActionEvent.ANY, (e) -> {
//            lblTexto.setText("Botão Ok foi apertado Lambda");
//        });
//
//        btnOutro.addEventHandler(ActionEvent.ANY, e -> {
//            lblTexto.setText("Botão Outro foi apertado Lambda");
//        });

        // 5ª Forma, uso do Lambda e do setOnAction
        btnOk.setOnAction( e -> {
            lblTexto.setText("Botão Ok foi apertado usando setOnAction");
        });

        btnOutro.setOnAction( e -> {
            lblTexto.setText("Botão Outro foi apertado usando setOnAction");
        });

        panPrincipal.setTop(lblTexto);
        panPrincipal.setBottom(btnOk);

        stage.setScene(scn);
        stage.setTitle("Tela com botão e label");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TelaComBotaoLabel.class, args);
    }
}
