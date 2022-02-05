package com.example.demo;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    public Tile(int x, int y){

        setWidth(HelloApplication.Sizeofboxs);
        setHeight(HelloApplication.Sizeofboxs);

        setFill(Color.RED);
        setStroke(Color.YELLOW);
    }
}