import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPane1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Button btn1 = new Button("Top");
        Button btn2 = new Button("Bottom");
        Button btn3 = new Button("Left");
        Button btn4 = new Button("Right");


        AnchorPane anchorPane = new AnchorPane();

        AnchorPane.setTopAnchor(btn1, 20.0);
        AnchorPane.setLeftAnchor(btn1, 80.0);
        AnchorPane.setRightAnchor(btn1, 80.0);
        
        AnchorPane.setBottomAnchor(btn2, 20.0);
        AnchorPane.setLeftAnchor(btn2, 80.0);
        AnchorPane.setRightAnchor(btn2, 80.0);
        
        AnchorPane.setTopAnchor(btn3, 70.0);
        AnchorPane.setLeftAnchor(btn3, 20.0);
        AnchorPane.setBottomAnchor(btn3, 70.0);
        
        AnchorPane.setTopAnchor(btn4, 70.0);
        AnchorPane.setRightAnchor(btn4, 20.0);
        AnchorPane.setBottomAnchor(btn4, 70.0);

        anchorPane.getChildren().addAll(btn1,btn2,btn3,btn4);


      
        Scene scene = new Scene(anchorPane, 400, 400);
        primaryStage.setTitle("AnchorPane");
        primaryStage.setScene(scene);          
        primaryStage.show(); 
            
    }
    public static void main(String[] args) {
        launch(args);
    }
}