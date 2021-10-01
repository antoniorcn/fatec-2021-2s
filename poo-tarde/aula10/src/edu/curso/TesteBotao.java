package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

class CapturadorMouse implements EventHandler<MouseEvent> {

    public void handle(MouseEvent e) {
        System.out.println("Type: " + e.getEventType().getName() +
                "X :" + e.getX() + "  Y: " + e.getY());
    }
}

class CapturadorPressionamentoBotao implements EventHandler<ActionEvent> {
    public void handle(ActionEvent e) {
        System.out.println("Botão foi pressionado");
    }
}

public class TesteBotao extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button("Aperte-me");
        FlowPane panPrincipal = new FlowPane();
        panPrincipal.getChildren().add(btn);

        CapturadorPressionamentoBotao cap =
                new CapturadorPressionamentoBotao();
        btn.addEventFilter(ActionEvent.ANY, cap);

        Scene scn = new Scene(panPrincipal, 300, 200);

        stage.setScene(scn);
        stage.setTitle("Teste de Botão");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TesteBotao.class, args);
    }


}
