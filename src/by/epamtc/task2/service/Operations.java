package by.epamtc.task2.service;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.enums.Colors;

import java.util.ArrayList;

public class Operations {
    private final Basket basket=new Basket();
    private final ArrayList<Ball> arrayList=basket.getList();

    public double ballsWeightCounter(){
        double weights=0d;
        for (Ball ball:arrayList){
            weights+=ball.getWeight();
        }
        return weights;
    }

    public long blueBallsCount(){
        return   arrayList.stream().filter(ball -> ball.getColor()
                .equals(Colors.BLUE))
                .count();
    }
}
