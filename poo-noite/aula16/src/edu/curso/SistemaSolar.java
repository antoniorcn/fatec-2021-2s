package edu.curso;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.InputStream;

public class SistemaSolar extends Application {

    public static double[] pontoCentro(Image img, double x, double y) {
        double px = x - img.getWidth() / 2;
        double py = y - img.getHeight() / 2;
        return new double[]{px, py};
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group grp = new Group();
        Scene scn = new Scene(grp);
        Pane pan = new Pane();
        Button btnZeraAngulo = new Button("Zera Angulo");
        pan.getChildren().add(btnZeraAngulo);
        pan.relocate(0, 600);

        InputStream is = getClass().getResourceAsStream("/images/space.png");
        Image imgSpace = new Image(is);
        Image imgSun = new Image(getClass().getResourceAsStream("/images/sun.png"));
        Image imgEarth = new Image(getClass().getResourceAsStream("/images/earth.png"));
        Image imgMars = new Image(getClass().getResourceAsStream("/images/mars.png"));
        Canvas canvas = new Canvas(imgSpace.getWidth(), imgSpace.getHeight());

        GraphicsContext ctx = canvas.getGraphicsContext2D();
        double[] angulo = new double[] {0, 270};

        btnZeraAngulo.setOnAction((e) -> {
            angulo[0] = 0;
            angulo[1] = 270;
        });

        double raio = 100;
        double raio_marte = 170;
        new AnimationTimer() {
            @Override
            public void handle(long now) {

                double ang_rad = angulo[0] / 180 * Math.PI;
                double ang_rad_marte = angulo[1] / 180 * Math.PI;
                double x_terra = (imgSpace.getWidth() / 2) + Math.cos(ang_rad) * raio;
                double y_terra = (imgSpace.getHeight() / 2) + Math.sin(ang_rad) * raio / 2;

                double x_marte = x_terra + Math.cos(ang_rad_marte) * raio_marte * 3/4;
                double y_marte = y_terra + Math.sin(ang_rad_marte) * raio_marte;

                double[] pontoSol = pontoCentro(imgSun, imgSpace.getWidth() / 2, imgSpace.getHeight() / 2);
                double[] pontoTerra = pontoCentro(imgEarth, x_terra, y_terra);
                double[] pontoMarte = pontoCentro(imgMars, x_marte, y_marte);
                ctx.drawImage(imgSpace, 0, 0);
                ctx.drawImage(imgSun, pontoSol[0], pontoSol[1]);
                ctx.drawImage(imgEarth, pontoTerra[0], pontoTerra[1]);
                ctx.drawImage(imgMars, pontoMarte[0], pontoMarte[1]);
                angulo[0] = angulo[0] + 1;
                angulo[1] = angulo[1] + 10;

            }
        }.start();

        grp.getChildren().addAll(pan, canvas);
        stage.setScene(scn);
        stage.setTitle("Sistema Solar");
        stage.show();
    }
}
