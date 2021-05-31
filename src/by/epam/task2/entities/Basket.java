package by.epam.task2.entities;


import java.util.ArrayList;


public class Basket {
    private  ArrayList<Ball> capacity;

    public Basket(ArrayList<Ball> capacity) {
        this.capacity = capacity;
    }

    public Basket(){


    }

    public void addBall(Ball ball){
        capacity.add(ball);
    }

    public double ballsWeightCounter(){
        double weights=0d;
        for (Ball ball:capacity){
         weights+=ball.getWeight();
        }
        return weights;
    }



    public long blueBallsCount(){
        return   capacity.stream().filter(ball -> ball.getColor()
                .equals("blue"))
                .count();
    }
}
