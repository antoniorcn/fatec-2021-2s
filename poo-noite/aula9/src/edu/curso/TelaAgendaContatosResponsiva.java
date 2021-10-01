package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TelaAgendaContatosResponsiva extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        FlowPane pan = new FlowPane();
        TilePane pan = new TilePane();
        pan.setPrefColumns(2);
        pan.setVgap(20);
        pan.setHgap(20);
        Scene scn = new Scene(pan, 600, 300);

        Label lblId = new Label("Id:");
        Label lblNome = new Label("Nome:");
        Label lblTelefone = new Label("Telefone:");

        TextField txtId = new TextField();
        txtId.setPrefWidth(350.0);
        TextField txtNome = new TextField();
        txtNome.setPrefWidth(350.0);
        TextField txtTelefone = new TextField();
        txtTelefone.setPrefWidth(350.0);

        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");

        pan.getChildren().addAll(lblId, txtId, lblNome, txtNome,
                lblTelefone, txtTelefone, btnSalvar, btnPesquisar);

        stage.setScene(scn);
        stage.setTitle("Agenda de Contatos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TelaAgendaContatosResponsiva.class, args);
    }
}
