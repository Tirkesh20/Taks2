package by.epamtc.task2.service;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.enums.Color;
import by.epamtc.task2.exception.IllegalArgumentException;
import by.epamtc.task2.exception.NoMuchFound;
import java.util.*;


public class Services {
    private final Basket basket;


    public Services(Basket basket) {
        this.basket = basket;
    }


    public  double ballsWeightCounter() {
        Map<Color, ArrayList<Ball>> map=basket.getMap();
        return map.values().stream().mapToDouble(balls -> balls.stream()
                                                                .mapToDouble(Ball::getWeight)
                                                                  .sum())
                                                                    .sum();
    }

    public static boolean isColor(String color){
      for (Color colors: Color.values()){
          if (colors.name().equalsIgnoreCase(color))
          return true;
      }
      return false;
    }


    public static Color stringToColor(String color) throws IllegalArgumentException {
        if (isColor(color)) return   Color.valueOf(color.toUpperCase());
        else throw new IllegalArgumentException("not a color");
    }


    public List<Ball> getListOfBalls(String color) throws NoMuchFound, IllegalArgumentException {
        if (color ==null){
            throw new IllegalArgumentException("color can't be null");
        }else {
            if (isColor(color)){
                return basket.getList(Services.stringToColor(color));
            }
            else throw new NoMuchFound("Balls not exist");
        }
    }

    public long getCount(String color) throws IllegalArgumentException, NoMuchFound {
        if (color==null){
            throw new IllegalArgumentException("color cant be null");
          }else return basket.getList(Services.stringToColor(color)).size();
        }


    public  void addBall(Ball ball){
        if (basket.getVolume()<ballsWeightCounter()){
            System.out.println("no space left");
        }else {
            basket.addBall(ball,ball.getColor());
        }
    }

    public Map<Color,ArrayList<Ball>> getMap(){
        return basket.getMap();
    }

}
