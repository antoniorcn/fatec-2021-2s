package edu.curso;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrincipalBoundary extends Application implements EventHandler<ActionEvent> {
//    private PetBoundary petBoundary = new PetBoundary();
//    private CreditoBoundary creditoBoundary = new CreditoBoundary();

    private Map<String, StrategyBoundary> telas = new HashMap<>();
    private BorderPane panePrincipal = new BorderPane();

    public PrincipalBoundary() {
        telas.put("Pets", new PetBoundary());
        telas.put("Créditos", new CreditoBoundary());
    }

    @Override
    public void start(Stage stage) throws Exception {

        Scene scn = new Scene(panePrincipal, 1024, 768);

        MenuBar menuPrincipal = new MenuBar();

        Menu menuArquivo = new Menu("Arquivos");
        Menu menuCadastros = new Menu("Cadastros");
        Menu menuAjuda = new Menu("Ajuda");
//        Menu menuTeste = new Menu("Teste");

        MenuItem itemSair = new MenuItem("Sair");
        MenuItem itemPets = new MenuItem("Pets");
        MenuItem itemCreditos = new MenuItem("Créditos");

        itemSair.setOnAction((e) -> {
            Platform.exit();
            System.exit(0);
        });

        itemPets.setOnAction(this);
        itemCreditos.setOnAction(this);

//        menuPrincipal.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
//            if (e.getTarget() == menuTeste) {
//                System.out.println("Menu Teste clicado " + e.getClickCount());
//            }
//        });

        menuArquivo.getItems().addAll(itemSair);
        menuCadastros.getItems().addAll(itemPets);
        menuAjuda.getItems().addAll(itemCreditos);

        menuPrincipal.getMenus().addAll(menuArquivo, menuCadastros, menuAjuda);
        panePrincipal.setTop(menuPrincipal);

        stage.setScene(scn);
        stage.setTitle("Gestão de Pets");
        stage.show();
    }


    @Override
    public void handle(ActionEvent event) {
        EventTarget target = event.getTarget();
        if (target instanceof MenuItem) {
            MenuItem menu = (MenuItem) target;
            String texto = menu.getText();
            StrategyBoundary tela = telas.get(texto);
            panePrincipal.setCenter(tela.render());
        }
    }


    public static void main(String[] args) {
        Application.launch(PrincipalBoundary.class, args);
    }

}
