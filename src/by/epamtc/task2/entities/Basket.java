package by.epamtc.task2.entities;


import by.epamtc.task2.enums.Color;
import by.epamtc.task2.exception.NoMuchFound;

import java.util.*;


public class Basket {
    private final Map<Color,ArrayList<Ball>> ballContainer;
    private double volume;

    public Basket(){
        this.ballContainer =new HashMap<>();
        this.volume=100d;
    }

    public void addBall(Ball ball, Color color){
        if (!ballContainer.containsKey(color)){
            ArrayList<Ball> list=new ArrayList<>();
            list.add(ball);
            ballContainer.put(color,list);
        }else {
            ArrayList<Ball> list = ballContainer.get(color);
            list.add(ball);
        }
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double value){
        this.volume=value;
    }

    public Map<Color,ArrayList<Ball>> getMap(){
        return this.ballContainer;
    }

    public List<Ball> getList(Color color) throws NoMuchFound {
        if (!ballContainer.containsKey(color)) {
            throw new NoMuchFound("No balls where added yet");
        }
        return ballContainer.get(color);
    }
}
