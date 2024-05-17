import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;


public class JavaFXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("JavaOp");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello");
            }
        });
        Text text = new Text("hello, world");
        HBox root = new HBox();
        root.getChildren().add(btn);
        root.getChildren().add(text);
        btn.setOnAction(event -> {
            text.setVisible(btn.isVisible());
        });
        Scene scene = new Scene(root, 300,300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
