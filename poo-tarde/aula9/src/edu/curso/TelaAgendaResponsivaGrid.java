package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TelaAgendaResponsivaGrid extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // FlowPane pan = new FlowPane();
        GridPane pan = new GridPane();
        pan.setHgap(20.0);
        pan.setVgap(20.0);
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

        pan.add(lblId, 0, 0);
        pan.add(txtId, 1, 0);
        pan.add(lblNome, 0, 1);
        pan.add(txtNome, 1, 1);
        pan.add(lblTelefone,0, 2);
        pan.add(txtTelefone, 1, 2);
        pan.add(btnSalvar, 0, 3);
        pan.add(btnPesquisar, 1, 3);

        stage.setScene(scn);
        stage.setTitle("Agenda de Contatos - Responsividade");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TelaAgendaResponsivaGrid.class, args);
    }
}
