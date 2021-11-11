package edu.curso;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PrincipalBoundary extends Application {
    private PetBoundary petBoundary = new PetBoundary();
    private CreditosBoundary creditosBoundary = new CreditosBoundary();

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bp = new BorderPane();
        Scene scn = new Scene(bp, 1024, 768);

        MenuBar menuBar = new MenuBar();

        Menu mnuArquivo = new Menu("Arquivo");
        Menu mnuCadastros = new Menu("Cadastro");
        Menu mnuAjuda = new Menu("Ajuda");
        
        menuBar.getMenus().addAll(mnuArquivo, mnuCadastros, mnuAjuda);

        MenuItem mnuItemSair = new MenuItem("Sair");
        mnuItemSair.setOnAction((e) -> {
            Platform.exit();
            System.exit(0);
        });
        MenuItem mnuItemPets = new MenuItem("Pets");
        mnuItemPets.setOnAction((e) -> {
            bp.setCenter( petBoundary.render() );
        });
        MenuItem mnuItemCreditos = new MenuItem("Créditos");
        mnuItemCreditos.setOnAction((e) -> {
            bp.setCenter( creditosBoundary.render() );
        });

        mnuArquivo.getItems().addAll(mnuItemSair);
        mnuCadastros.getItems().addAll(mnuItemPets);
        mnuAjuda.getItems().addAll(mnuItemCreditos);

        bp.setTop(menuBar);

        stage.setScene( scn );
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(PrincipalBoundary.class, args);
    }
}
