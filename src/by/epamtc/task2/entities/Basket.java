package by.epamtc.task2.entities;


import by.epamtc.task2.enums.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Basket {
    private final ArrayList<Ball> capacity;


    public Basket(){
        this.capacity=new ArrayList<>();
    }


    public void addBall(Ball ball){
        capacity.add(ball);
    }

    public ArrayList getList(){
        return capacity;
    }

}
