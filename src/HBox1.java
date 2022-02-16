import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBox1 extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    Button btn1 = new Button("Button 1");
    Button btn2 = new Button("Button 2");
    Button btn3 = new Button("Button 3");
    Button btn4 = new Button("Button 4");
    Button btn5 = new Button("Button 5");

    HBox hbox = new HBox(15, btn1, btn2, btn3, btn4, btn5);

    Scene scene = new Scene(hbox, 400, 400);
    primaryStage.setTitle("HBox");
    primaryStage.setScene(scene);
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }
}
