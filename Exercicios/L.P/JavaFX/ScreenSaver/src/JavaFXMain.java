import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.util.Random;


public class JavaFXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300,300);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene); // conf a cena

        Rectangle r1 = new Rectangle();
        r1.setX(0); // posicao x
        r1.setY(60); // posicao Y
        r1.setWidth(30); // largura
        r1.setHeight(20); // altura
        r1.setFill(Color.LAVENDER); // cor
        root.getChildren().add(r1); // add o r1 na cena


        final long startNanoTime = System.nanoTime();
        new AnimationTimer(){
            double speedY = 3;
            double speedX = 4;
            Random rd = new Random();
            //
            @Override
            public void handle (long currenNanoTime){

                double timer = (currenNanoTime - startNanoTime)/10000000000.0;
                // animação
                if(r1.getX() > scene.getWidth()-r1.getWidth() -10 || r1.getX()<0) {
                    speedX *= -1;
                    r1.setFill(Color.rgb(rd.nextInt(256), rd.nextInt(256),rd.nextInt(256)));
                }
                if(r1.getY() > scene.getHeight()-r1.getHeight() -10 || r1.getY()<0)
                    speedY *= -1;

                r1.setX(r1.getX() + speedX);
                r1.setY(r1.getY() + speedY);

                //
            }
        }.start();


        primaryStage.show();
    }
}
