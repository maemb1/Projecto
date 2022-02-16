import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");

        GridPane gridPane = new GridPane();

        gridPane.add(btn1, 1, 1);
        gridPane.add(btn2, 2, 1);
        gridPane.add(btn3, 1, 2);
        gridPane.add(btn4, 2, 2);
        gridPane.add(btn5, 1, 3);

        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setTitle("GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}