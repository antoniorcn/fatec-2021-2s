package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TelaAgenda extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pan = new Pane();
        Scene scn = new Scene(pan, 600, 300);

        Label lblId = new Label("Id:");
        lblId.relocate(20, 20);
        Label lblNome = new Label("Nome:");
        lblNome.relocate(20, 100);
        Label lblTelefone = new Label("Telefone:");
        lblTelefone.relocate(20, 180);

        TextField txtId = new TextField();
        txtId.relocate(200, 20);
        txtId.setPrefWidth(350.0);
        TextField txtNome = new TextField();
        txtNome.relocate(200, 100);
        txtNome.setPrefWidth(350.0);
        TextField txtTelefone = new TextField();
        txtTelefone.relocate(200, 180);
        txtTelefone.setPrefWidth(350.0);

        Button btnSalvar = new Button("Salvar");
        btnSalvar.relocate(20, 260);
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.relocate(80, 260);

        pan.getChildren().addAll(lblId, lblNome, lblTelefone,
                txtId, txtNome, txtTelefone, btnSalvar, btnPesquisar);

        stage.setScene(scn);
        stage.setTitle("Agenda de Contatos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TelaAgenda.class, args);
    }
}
