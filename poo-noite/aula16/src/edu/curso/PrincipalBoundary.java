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

public class PrincipalBoundary extends Application implements CommandExecution {
    private PetBoundary petBoundary = new PetBoundary();
    private CreditoBoundary creditoBoundary = new CreditoBoundary();

    private BorderPane panePrincipal = new BorderPane();

    public PrincipalBoundary() {
        creditoBoundary.addExecution(this);
        petBoundary.addExecution(this);
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
            execute("SAIR");
        });

        itemPets.setOnAction((e) -> {
            execute("BOUNDARY-PET");
        });

        itemCreditos.setOnAction((e) -> {
            execute("BOUNDARY-CREDITOS");
        });

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

//
//    @Override
//    public void handle(ActionEvent event) {
//        EventTarget target = event.getTarget();
//        if (target instanceof MenuItem) {
//            MenuItem menu = (MenuItem) target;
//            String texto = menu.getText();
//            StrategyBoundary tela = telas.get(texto);
//            panePrincipal.setCenter(tela.render());
//        }
//    }

    @Override
    public void execute(String command) {
        if ("BOUNDARY-PET".equals(command)) {
            panePrincipal.setCenter(petBoundary.render());
        } else if ("BOUNDARY-CREDITOS".equals(command)) {
            panePrincipal.setCenter(creditoBoundary.render());
        } else if ("SAIR".equals(command)) {
            Platform.exit();
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        Application.launch(PrincipalBoundary.class, args);
    }


}
