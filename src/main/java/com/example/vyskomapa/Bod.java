package com.example.vyskomapa;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import static com.example.vyskomapa.Vyskomapa.sizeY;
import static com.example.vyskomapa.Vyskomapa.bodSize;

public class Bod extends Rectangle {

    private Vyska vyska1 = new Vyska(150);
    private int coordX;
    private int coordY;


    public Bod(int coordX, int coordY, Vyska vyska1) {
        this.vyska1 = vyska1;
        setWidth(bodSize);
        setHeight(bodSize);
        setFill(vyska1.getBarva());
        setLayoutX(coordX);
        setLayoutY(coordY);

    }
    public Vyska getVyska(){
        return vyska1;
    }

    public Color getBarva(){
        return vyska1.getBarva();
    }

    public int getCoordX(){
        return coordX;
    }

    public int getCoordY(){
        return coordY;
    }



}
