package by.epamtc.task2.service;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.enums.Colors;
import by.epamtc.task2.exception.NoMuchFound;

import java.util.*;


public class Services {
    private final Basket basket;



    public Services(Basket basket) {
        this.basket = basket;
    }

    public Services(){
        this.basket=new Basket();
    }

    public  double ballsWeightCounter() {
        Map<Colors, ArrayList<Ball>> map=basket.getMap();
        return map.values().stream().mapToDouble(balls -> balls.stream().mapToDouble(Ball::getWeight).sum()).sum();

    }

    public List<Ball> getListOfBalls(Colors colors){
        return basket.getList(colors);
    }

    public long blueBallsCount() throws NoMuchFound {
        return basket.getList(Colors.BLUE).size();
    }

    public void addBall(Ball ball,Colors colors){
        basket.addBall(ball,colors);
    }

    public Map getMap(){
        return basket.getMap();
    }

}
