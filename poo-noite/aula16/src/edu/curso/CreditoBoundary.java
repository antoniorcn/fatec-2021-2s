package edu.curso;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CreditoBoundary extends CommandProducer implements StrategyBoundary {

    @Override
    public Pane render() {
        VBox pane = new VBox();
        Button btnPets = new Button("Cadastro Pets");
        pane.getChildren().addAll(
            new Label("Ricardo Satoshi professor de Banco de Dados"),
            new Label("Fatec Zona Leste"),
            new Label("Coordenador Luciano Oliveira"),
            new Label("Antonio Rodrigues professor de POO"),
            new Label("Aos alunos da turma da Noite de POO em 2021 2º semestre"),
                btnPets
        );

        btnPets.setOnAction( (e) -> {
            executeCommand("BOUNDARY-PET");
        });

        return pane;
    }
}
