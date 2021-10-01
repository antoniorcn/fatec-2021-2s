package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TelaAgendaContatos extends Application {

    @Override
    public void start(Stage stage) {
        Pane pan = new Pane();
        Scene scn = new Scene(pan, 600, 300);

        Label lblId = new Label("Id:");
        lblId.relocate(20.0, 30.0);
        Label lblNome = new Label("Nome:");
        lblNome.relocate(20.0, 80.0);
        Label lblTelefone = new Label("Telefone:");
        lblTelefone.relocate(20.0, 130.0);

        TextField txtId = new TextField();
        txtId.relocate(150.0, 30.0);
        txtId.setPrefWidth(350.0);
        TextField txtNome = new TextField();
        txtNome.setPrefWidth(350.0);
        txtNome.relocate(150.0, 80.0);
        TextField txtTelefone = new TextField();
        txtTelefone.setPrefWidth(350.0);
        txtTelefone.relocate(150.0, 130.0);

        Button btnSalvar = new Button("Salvar");
        btnSalvar.relocate(20.0, 180.0);
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.relocate(80.0, 180.0);

        pan.getChildren().addAll(lblId, txtId, lblNome, txtNome,
                lblTelefone, txtTelefone, btnSalvar, btnPesquisar);

        stage.setScene(scn);
        stage.setTitle("Agenda de Contatos");
        stage.show();
    }
}
