package InventoryManagementSystem;

/**
* Name: Cobbina Emmanuel Adu Boateng
* Id: 10918207
 **/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/InventoryManagementSystem/view_controller/Main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Inventory Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}