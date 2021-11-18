package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PetBoundary extends Tela {
    private TextField txtId = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtRaca = new TextField();
    private TextField txtPeso = new TextField();
    private TextField txtNascimento = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnSalvar = new Button("Salvar");
    private Button btnPesquisar = new Button("Pesquisar");
    private Button btnCreditos = new Button("Creditos");

    private PetControl control = new PetControl();   // composição

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private TableView<Pet> table;

    private void criarTabela() {
        table = new TableView<>();
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

        TableColumn<Pet, String> col5 = new TableColumn<>("Nascimento");
        col5.setCellValueFactory( (item) -> {
                    LocalDate d = item.getValue().getNascimento();
                    return new ReadOnlyStringWrapper(d.format(fmt));
                }
        );

        TableColumn<Pet, String> col6 = new TableColumn<>("Ações");
        col6.setCellFactory( (tbcol) -> {
            Button btnRemover = new Button("Remover");
            TableCell<Pet, String> tcell = new TableCell<Pet, String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        btnRemover.setOnAction( (e) -> {
                            Pet p = getTableView().getItems().get(getIndex());
                            control.remover(p.getId());
                        });
                        setGraphic(btnRemover);
                        setText(null);
                    }
                }
            };
            return tcell;
            }
        );

        table.getSelectionModel().selectedItemProperty().addListener( (obs, old, novo) -> {
                    control.fromEntity(novo);
                }
        );

        table.getColumns().addAll(col1, col2, col3, col4, col5, col6);
        table.setItems(control.getLista());
    }

    @Override
    public Pane render() {
        BorderPane panPrincipal = new BorderPane();
        GridPane panCampos = new GridPane();

        criarTabela();

        panPrincipal.setTop(panCampos);
        panPrincipal.setCenter(table);

        txtId.setEditable(false);

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
        panCampos.add(btnSalvar, 1, 5);
        panCampos.add(btnPesquisar, 2, 5);
        panCampos.add(btnCreditos, 3, 5);


        btnAdicionar.setOnAction((e) -> {
            control.adicionar();
        });

        btnPesquisar.setOnAction( (e) -> {
            control.pesquisar();
        });

        btnSalvar.setOnAction( (e) -> {
            control.salvar();
            new Alert(Alert.AlertType.INFORMATION, "Pet salvo com sucesso").showAndWait();
        });

        btnCreditos.setOnAction( (e) -> {
            notificarComando("TELA-CREDITO");
        });

        return panPrincipal;
    }

//    public static void main(String[] args) {
//        Application.launch(PetBoundary.class, args);
//    }
}
