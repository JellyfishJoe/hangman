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
    private Label inst = new Label("Enter any English word");
    private Label guessedWord = new Label("_ _ _");
    private Label correctWord = new Label("wow");
    private Label wrongGuesses = new Label("asd");
    private Button myButton;
        
    public void start(Stage stage) throws Exception
    {
        input = new TextField();
        input.setText("");

        myButton = new Button("Submit");

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
        pane.add(inst, 1, 0);
        pane.add(correctWord, 0, 2);
        pane.add(guessedWord, 0, 3);
        pane.add(wrongGuesses, 1, 3);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 300,150);
        stage.setTitle("Hangman Game");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    private void main(ActionEvent event){
    	myButton.setVisible(false);
    	input.setVisible(false);
    	inst.setVisible(false);
    	Game hangmanGame = new Game();
    	String inputWord = input.getText();
    	correctWord.setText(inputWord);
    	hangmanGame.main(inputWord);
    }
}
