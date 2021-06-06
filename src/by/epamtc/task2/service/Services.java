package by.epamtc.task2.service;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.enums.Colors;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.scanners.Scanners;
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
        return map.values().stream().mapToDouble(balls -> balls.stream()
                                                                .mapToDouble(Ball::getWeight)
                                                                  .sum())
                                                                    .sum();
    }


    public static boolean isColor(String color){
        return Arrays.stream(Colors.values()).findAny().equals(color.toUpperCase());
    }
    public static Colors stringToColor(String color) throws NoMuchFound {
        if (Arrays.stream(Colors.values()).findAny().equals(color.toUpperCase())){
            return  Colors.valueOf(color.toUpperCase());
        }else {
            throw new NoMuchFound();
        }
    }

    public List<Ball> getListOfBalls(Colors colors){
        if (colors==null){
            throw new IllegalArgumentException();
        }else {
            return basket.getList(colors);
        }
    }

    public long blueBallsCount() {
        return basket.getList(Colors.BLUE).size();
    }

    public void addBall(Ball ball,Colors colors){
        if (basket.getVolume()<ballsWeightCounter()){
            System.out.println("no space left");
        }else {
            basket.addBall(ball, colors);
        }
    }

    public Map<Colors,ArrayList<Ball>> getMap(){
        return basket.getMap();
    }

}
