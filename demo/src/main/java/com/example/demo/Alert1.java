package com.example.demo;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.InputStream;

public class Alert1 {
    public static void display(String title,String message) {
        Stage stage = new Stage();


        Image image = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/CBD7EB31-9191-4924-B99B-8DE006339A5A.jpeg?raw=true");
        //Creating the image view
        ImageView imageView = new ImageView();
        //Setting image to the image view
        imageView.setImage(image);
        //Setting the image view parameters

        imageView.setFitWidth(800);
        imageView.setFitHeight(800);
        imageView.setPreserveRatio(true);
        //Setting the Scene object
        Group root = new Group(imageView);
        Scene scene = new Scene(root);
        stage.setTitle("GAME END");
        stage.setScene(scene);
        stage.show();

    }

    }
