package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/index.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("ISPWEXAM!");
        stage.setScene(scene);
        stage.show();
        //se metti la view ricordati di mettere view come resources vedere NIGHTSOUT 
    }

    public static void main(String[] args) {
        launch();
    }
}