package by.epamtc.task2.entities;


import by.epamtc.task2.enums.Color;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.exception.OverweightException;
import by.epamtc.task2.service.Services;

import java.util.*;


public class Basket {
    private final Map<Color,ArrayList<Ball>> ballContainer;
    private double volume;

    public Basket(){
        this.ballContainer =new HashMap<>();
    }

    public Iterator<Ball> getBallsIterator(Color color) throws NoMuchFound {
        if (!ballContainer.containsKey(color)){
          throw new NoMuchFound("container empty");
        }else {
            ArrayList<Ball> list = ballContainer.get(color);
            return list.iterator();
        }
    }

    public void addBall(Ball ball, Color color) throws OverweightException {
        if (!ballContainer.containsKey(color)){
            ArrayList<Ball> list=new ArrayList<>();
            list.add(ball);
            ballContainer.put(color,list);
        }else if (volume< ballsWeightCounter()){
                throw  new OverweightException("no space left");
            }else {
            ArrayList<Ball> list = ballContainer.get(color);
            list.add(ball);
            }
        }

    public  double ballsWeightCounter() {
        Map<Color, ArrayList<Ball>> map = getMap();
        return map.values().stream().mapToDouble(balls -> balls.stream()
                .mapToDouble(Ball::getWeight)
                .sum())
                .sum();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double value){
        this.volume=value;
    }

    private Map<Color,ArrayList<Ball>> getMap(){
        return this.ballContainer;
    }

    public List<Ball> getList(Color color) throws NoMuchFound {
        if (!ballContainer.containsKey(color)) {
            throw new NoMuchFound("No balls where added yet");
        }
        return ballContainer.get(color);
    }

    @Override
    public int hashCode() {
        int result = 16;
        result = 21 * result + Double.hashCode(volume);
        result = 21 * result + (ballContainer.isEmpty() ? 0 : ballContainer.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Double.compare(basket.volume, volume) == 0 && Objects.equals(ballContainer, basket.ballContainer);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "ballContainer=" + ballContainer +
                ", volume=" + volume +
                '}';
    }
}
