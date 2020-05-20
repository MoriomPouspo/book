package sample;

import Scene1.UserPage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene1/UserPage.fxml"));
        Parent root = loader.load();
        UserPage userPage = loader.getController();
        userPage.setEmail("soomit@gmail.com");

        //primaryStage.setTitle();
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) throws SQLException {

        launch(args);

    }
}
