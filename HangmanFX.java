import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.io.*;

/**
 * Write a description of JavaFX class gui here.
 *
 * @author Evan Tone
 * @version (a version number or a date)
 */
public class HangmanFX extends Application {
    // We keep track of the count, and label displaying the count:
    private TextField input;
    private Label output = new Label("");
        
    public void start(Stage stage) throws Exception
    {
        input = new TextField();
        input.setText("");
        
        // Create a Button or any control item
        Button myButton = new Button("Submit");

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        myButton.setOnAction(this::main);

        // Add the button and label into the pane
        pane.add(input, 0, 0);
        pane.add(myButton, 0, 1);
        pane.add(output, 0, 3);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 300,100);
        stage.setTitle("Hangman Game");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    private void main(ActionEvent event)
    {
    }
}
