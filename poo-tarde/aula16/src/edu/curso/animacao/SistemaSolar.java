package edu.curso.animacao;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class SistemaSolar extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group grp = new Group();
        Scene scn = new Scene(grp);

        stage.setScene(scn);
//        URL teste = getClass().getResource("/");
//        System.out.println("URL " + teste.getPath());
        InputStream is = getClass().getResourceAsStream("/images/space.png");
//        System.out.printf("Input Stream ");
//        System.out.println(is);
        Image space = new Image(is);
        Image sun = new Image(getClass().getResourceAsStream("/images/sun.png"));
        Image terra = new Image(getClass().getResourceAsStream("/images/earth.png"));
        Image marte = new Image(getClass().getResourceAsStream("/images/mars.png"));

        Canvas canvas = new Canvas(space.getWidth(), space.getHeight());
        GraphicsContext ctx = canvas.getGraphicsContext2D();
        grp.getChildren().addAll(canvas);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                double angulo = (now / 10000000) % 360;
                double[] centroSol = pontoCentro(sun, space.getWidth() / 2, space.getHeight() / 2);

//                Ângulo 0 .. 360
//                Cos = Cos ( ângulo )
//                Sin = Sin( ângulo )
//
//                X = X_sol + (raio * cos)
//                Y = Y_sol + (raio * sin)
                double raio_terra = 150.0;
                double raio_marte = 250.0;
                double angulo_rad = angulo / 180 * Math.PI;
                double cos = Math.cos(angulo_rad);
                double sin = Math.sin(angulo_rad);
                double x_terra = space.getWidth() / 2 + raio_terra * cos;
                double y_terra = space.getHeight() / 2 + raio_terra * 1/2 * sin;

                double x_marte = space.getWidth() / 2 + raio_marte * 1/2 * cos;
                double y_marte = space.getHeight() / 2 + raio_marte * sin;

                double[] centroTerra = pontoCentro(terra, x_terra, y_terra);
                double[] centroMarte = pontoCentro(marte, x_marte, y_marte);

                ctx.drawImage(space, 0, 0);
                ctx.drawImage(sun, centroSol[0], centroSol[1]);
                ctx.drawImage(terra, centroTerra[0], centroTerra[1]);
                ctx.drawImage(marte, centroMarte[0], centroMarte[1]);

            }
        }.start();

        stage.setTitle("Sistema Solar");
        stage.show();
    }

    double[] pontoCentro(Image img, double x, double y) {
        double px = x - img.getWidth() / 2;
        double py = y - img.getHeight() / 2;
        return new double[]{px, py};
    }


    public static void main(String[] args) {
        Application.launch(SistemaSolar.class, args);
    }
}
