package de.mg.tgi.bitstream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hauptklasse
 *
 * @author moraelyn
 * @version 1.0
 */
public class Main extends Application {

    /**
     * Hauptmethode
     *
     * @param args Kommandozeilenparameter
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui/GUI.fxml"));
        primaryStage.setTitle("BitStreamVisualizer");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
