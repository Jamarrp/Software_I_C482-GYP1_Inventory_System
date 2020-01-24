package Main;
//Git test
//Git test passed!
import Model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Jamar Plummer
 * Western Governors University
 * Software I - C482
 * Performance Assessment GYP1
 * Inventory Program
 */

public class InventoryProgram extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
        primaryStage.setTitle("INVENTORY MANAGEMENT SYSTEM");
        primaryStage.setScene(new Scene(root, 1050, 611));
        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);}

}
