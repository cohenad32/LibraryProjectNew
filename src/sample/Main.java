package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class Main /*extends Application */{

    /*@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

*/
    public static void main(String[] args) {
        Customer sam = new RegularCustomer("Sam", "Smith", "ss@ss.com");
        Material m = new Book(3230);
        sam.returnMaterial(m);
        //launch(args);
    }
}
