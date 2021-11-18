package edu.curso;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CreditosBoundary extends Tela {

    @Override
    public Pane render() {
        BorderPane panPrincipal = new BorderPane();
        VBox panCreditos = new VBox();

        panPrincipal.setCenter(panCreditos);

        Button btnPet = new Button("Cadastro Pet");
        btnPet.setOnAction((e) -> {
            notificarComando("TELA-PET");
        });

        panCreditos.getChildren().addAll(
          new Label("Faculdade de Tecnologia da Zona Leste"),
                new Label("Luciano Oliveira - Coordenação"),
                new Label("Antonio Carvalho - Professor de POO"),
                new Label("Leandro Colevatti - Professor de Banco de Dados"),
                btnPet
        );
        return panPrincipal;
    }
}
