package edu.curso;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PrincipalBoundary extends Application implements ExecutorComandos {
    private PetBoundary petBoundary = new PetBoundary();
    private CreditosBoundary creditosBoundary = new CreditosBoundary();
    private BorderPane bp = new BorderPane();

    @Override
    public void start(Stage stage) throws Exception {
        Scene scn = new Scene(bp, 1024, 768);

        MenuBar menuBar = new MenuBar();

        Menu mnuArquivo = new Menu("Arquivo");
        Menu mnuCadastros = new Menu("Cadastro");
        Menu mnuAjuda = new Menu("Ajuda");
        
        menuBar.getMenus().addAll(mnuArquivo, mnuCadastros, mnuAjuda);

        MenuItem mnuItemSair = new MenuItem("Sair");
        mnuItemSair.setOnAction((e) -> {
            executarComando("SAIR");
        });
        MenuItem mnuItemPets = new MenuItem("Pets");
        mnuItemPets.setOnAction((e) -> {
            executarComando("TELA-PET");
        });
        MenuItem mnuItemCreditos = new MenuItem("Créditos");
        mnuItemCreditos.setOnAction((e) -> {
            executarComando("TELA-CREDITO");
        });

        petBoundary.adicionarExecutor(this);
        creditosBoundary.adicionarExecutor(this);

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

    @Override
    public void executarComando(String comando) {
        // TELA-CREDITO
        // TELA-PET
        // SAIR
        if ("TELA-CREDITO".equals(comando)) {
            bp.setCenter( creditosBoundary.render() );
        } else if ("TELA-PET".equals(comando)) {
            bp.setCenter( petBoundary.render() );
        } else if ("SAIR".equals(comando)) {
            Platform.exit();
            System.exit(0);
        }
    }
}
