package edu.curso;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CreditosBoundary {

    public Pane render() {
        BorderPane panPrincipal = new BorderPane();
        VBox panCreditos = new VBox();

        panPrincipal.setCenter(panCreditos);

        panCreditos.getChildren().addAll(
          new Label("Faculdade de Tecnologia da Zona Leste"),
                new Label("Luciano Oliveira - Coordenação"),
                new Label("Antonio Carvalho - Professor de POO"),
                new Label("Leandro Colevatti - Professor de Banco de Dados")
        );
        return panPrincipal;
    }
}
