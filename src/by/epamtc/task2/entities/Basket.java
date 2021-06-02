package by.epamtc.task2.entities;


import by.epamtc.task2.enums.Colors;
import by.epamtc.task2.exception.NoMuchFound;

import java.util.*;


public class Basket {
    private final Map<Colors,ArrayList<Ball>> ballContainer;


    public Basket(){
        this.ballContainer =new HashMap<>();
    }

    public void addBall(Ball ball,Colors color){
        if (!ballContainer.containsKey(color)){
            ArrayList<Ball> list=new ArrayList<>();
            list.add(ball);
            ballContainer.put(color,list);
        }else {
            ArrayList<Ball> list = ballContainer.get(color);
            list.add(ball);
        }
    }

    public Map<Colors,ArrayList<Ball>> getMap(){
        return this.ballContainer;
    }

    public List<Ball> getList(Colors color)  {
        if (!ballContainer.containsKey(color)) {
            return null;
        }
        return ballContainer.get(color);
    }


}
