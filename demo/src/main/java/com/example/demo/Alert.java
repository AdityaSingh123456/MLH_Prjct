package com.example.demo;

import javafx.geometry.Pos;
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

public class Alert {

    public static void display(String title,String message){
        Stage stage = new Stage();

//        window.initModality(Modality.APPLICATION_MODAL);
//        window.setTitle(title);
//        window.setMinWidth(600);
//        window.setMinHeight(600);
//        Image image = new Image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F716283515705192527%2F&psig=AOvVaw1nq5X-MQViua9duwqrImPY&ust=1640163750542000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPjXxaDE9PQCFQAAAAAdAAAAABAD");
//        ImageView mv = new ImageView(image);
//        Group root = new Group();
//        root.getChildren().addAll(mv);
////
////        Label l = new Label();
////        l.setText(message);
////        Button closeButton = new Button("Close the window");
////        closeButton.setOnAction(event -> window.close());
//
////        VBox layout = new VBox(10);
////        layout.getChildren().addAll(l,closeButton);
////        layout.setAlignment(Pos.CENTER);
//
//        Scene scene=new Scene(root,600,600);
//        window.setScene(scene);
//        window.showAndWait();



        Image image = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/CBD7EB31-9191-4924-B99B-8DE006339A5A.jpeg?raw=true");
        //Creating the image view
        ImageView imageView = new ImageView();
        //Setting image to the image view
        imageView.setImage(image);
        //Setting the image view parameters

        imageView.setFitWidth(600);
        imageView.setFitHeight(600);
        imageView.setPreserveRatio(true);
        //Setting the Scene object
        Group root = new Group(imageView);
        Scene scene = new Scene(root);
        stage.setTitle(message);
        stage.setScene(scene);
        stage.show();



    }


}
