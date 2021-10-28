package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PetBoundary extends Application {
    private TextField txtId = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtRaca = new TextField();
    private TextField txtPeso = new TextField();
    private TextField txtNascimento = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private PetControl control = new PetControl();   // composição

    private TableView<Pet> table = new TableView<>();

    private void criarTabela() {
        TableColumn<Pet, Long> col1 = new TableColumn<>("Id");
        col1.setCellValueFactory(
                new PropertyValueFactory<Pet, Long>("id")
        );

        TableColumn<Pet, String> col2 = new TableColumn<>("Nome");
        col2.setCellValueFactory(
                new PropertyValueFactory<Pet, String>("nome")
        );

        TableColumn<Pet, String> col3 = new TableColumn<>("Raça");
        col3.setCellValueFactory(
                new PropertyValueFactory<Pet, String>("raca")
        );

        TableColumn<Pet, Double> col4 = new TableColumn<>("Peso");
        col4.setCellValueFactory(
                new PropertyValueFactory<Pet, Double>("peso")
        );

        table.getColumns().addAll(col1, col2, col3, col4);
        table.setItems(control.getLista());
    }

    public void start(Stage stage) {
        BorderPane panPrincipal = new BorderPane();
        GridPane panCampos = new GridPane();
        Scene scn = new Scene(panPrincipal, 600, 400);

        panPrincipal.setTop(panCampos);
        panPrincipal.setCenter(table);

        criarTabela();

        Bindings.bindBidirectional(txtId.textProperty(), control.id, new NumberStringConverter());
        Bindings.bindBidirectional(txtNome.textProperty(), control.nome);
        Bindings.bindBidirectional(txtRaca.textProperty(), control.raca);
        Bindings.bindBidirectional(txtPeso.textProperty(), control.peso, new NumberStringConverter());
        Bindings.bindBidirectional(txtNascimento.textProperty(), control.nascimento, new LocalDateStringConverter());

        panCampos.add(new Label("Id:"), 0, 0);
        panCampos.add(txtId, 1, 0);
        panCampos.add(new Label("Nome:"), 0, 1);
        panCampos.add(txtNome, 1, 1);
        panCampos.add(new Label("Raça:"), 0, 2);
        panCampos.add(txtRaca, 1, 2);
        panCampos.add(new Label("Peso:"), 0, 3);
        panCampos.add(txtPeso, 1, 3);
        panCampos.add(new Label("Nascimento:"), 0, 4);
        panCampos.add(txtNascimento, 1, 4);

        panCampos.add(btnAdicionar, 0, 5);
        panCampos.add(btnPesquisar, 1, 5);


        btnAdicionar.setOnAction((e) -> {
            control.adicionar();
//            Alert a = new Alert(Alert.AlertType.INFORMATION, "Pet adicionado com sucesso");
//            a.showAndWait();

            new Alert(Alert.AlertType.INFORMATION, "Pet adicionado com sucesso").showAndWait();
        });

        btnPesquisar.setOnAction( (e) -> {
            control.pesquisar();
        });

        stage.setScene(scn);
        stage.setTitle("Gestão de Pets");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(PetBoundary.class, args);
    }
}
