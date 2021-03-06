package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {

// uncomment out each line to test out each form
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("createCustomer.fxml"));
        // Parent root = FXMLLoader.load(getClass().getResource("updateCustomer.fxml"));
        // Parent root = FXMLLoader.load(getClass().getResource("checkOutMaterial.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
