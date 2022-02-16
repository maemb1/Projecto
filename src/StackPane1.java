import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPane1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btn1 = new Button("-------Button 1-------");
        Button btn2 = new Button("Button 2");

        StackPane root = new StackPane();
      
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);

    
        Scene scene = new Scene(root, 400, 400);
        

        primaryStage.setTitle("StackPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}