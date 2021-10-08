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

import javax.xml.soap.Text;

class TesteHandle implements EventHandler<ActionEvent> {
    Label lblTeste;
    public TesteHandle(Label valor) {
        this.lblTeste = valor;
    }
    public void handle(ActionEvent e) {
        // System.out.println("Atualiza o Label");
        lblTeste.setText("Label atualizado");
    }
}

public class TelaComBotaoLabel extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //        VBox panPrincipal = new VBox();
        BorderPane panPrincipal = new BorderPane();
        Scene scn = new Scene(panPrincipal, 400, 200);

        Label lblTexto = new Label("Texto");
        Button btnOk = new Button("Ok");
        // 1ª forma com uma agregação publica
        // TesteHandle testeHandle = new TesteHandle();
        // testeHandle.lblTeste = lblTexto;
        // btnOk.addEventFilter(ActionEvent.ANY, testeHandle);

        // 2ª forma com uma agregação provida pelo construtor
        // btnOk.addEventFilter(ActionEvent.ANY, new TesteHandle(lblTexto));

        // 3ª forma classe anonima
//        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent e) {
//                lblTexto.setText("Label atualizado 3ª forma");
//            }
//        };
//        btnOk.addEventHandler(ActionEvent.ANY, handler);

        // 4ª forma classe anonima direto no addEventHandler
//        btnOk.addEventHandler(ActionEvent.ANY, new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent e) {
//                lblTexto.setText("Label atualizado direto no addEventHandler 4ª forma");
//            }
//        });

//        // 5a forma usando Lambda
//        btnOk.addEventHandler(ActionEvent.ANY, (e) -> {
//            lblTexto.setText("Atualizado via Lambda 5ª forma");
//        });

        btnOk.setOnAction( (e) -> {
            lblTexto.setText("Atualizado via Lambda na 6ª forma usando setOnAction");
        });





        BorderPane.setAlignment(lblTexto, Pos.CENTER);
        BorderPane.setAlignment(btnOk, Pos.CENTER);

        panPrincipal.setTop(lblTexto);
        panPrincipal.setBottom(btnOk);

        stage.setScene(scn);
        stage.setTitle("Botão com Label");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TelaComBotaoLabel.class, args);
    }
}
