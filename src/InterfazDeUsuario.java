import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InterfazDeUsuario extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lblButton = new Label("Button: ");
        Label lblCheckBox = new Label("CheckBox: ");
        Label lblHyperLink = new Label("Hyperlink: ");
        Label lblToggleButton = new Label("ToggleButton: ");
        Label lblRadioButton = new Label("RadioButton: ");
        Label lblLabel = new Label("Label");
        Label lblTextField = new Label("TextField");

        Button Button = new Button("Button");
        CheckBox CheckBox = new CheckBox("CheckBox");
        Hyperlink HyperLink = new Hyperlink("HyperLink");
        ToggleButton ToggleButton = new ToggleButton("ToggleButton");
        RadioButton RadioButton = new RadioButton("RadioButton");
        Label Label = new Label("Label");
        TextField TextField = new TextField("Some text...");

        GridPane gridPane = new GridPane();

        gridPane.add(lblButton, 0, 0);
        GridPane.setMargin(lblButton, new Insets(15, 50, 10, 10));

        gridPane.add(lblCheckBox, 0, 1);
        GridPane.setMargin(lblCheckBox, new Insets(15, 50, 10, 10));

        gridPane.add(lblHyperLink, 0, 2);
        GridPane.setMargin(lblHyperLink, new Insets(15, 50, 10, 10));

        gridPane.add(lblToggleButton, 0, 3);
        GridPane.setMargin(lblToggleButton, new Insets(15, 50, 10, 10));

        gridPane.add(lblRadioButton, 0, 4);
        GridPane.setMargin(lblRadioButton, new Insets(15, 50, 10, 10));

        gridPane.add(lblLabel, 0, 5);
        GridPane.setMargin(lblLabel, new Insets(15, 50, 10, 10));

        gridPane.add(lblTextField, 0, 6);
        GridPane.setMargin(lblTextField, new Insets(15, 50, 10, 10));

        gridPane.add(Button, 1, 0);
        gridPane.add(CheckBox, 1, 1);
        gridPane.add(HyperLink, 1, 2);
        gridPane.add(ToggleButton, 1, 3);
        gridPane.add(RadioButton, 1, 4);
        gridPane.add(Label, 1, 5);
        gridPane.add(TextField, 1, 6);

        Scene scene = new Scene(gridPane, 480, 300);
        primaryStage.setTitle("Interaz de Usuario");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}