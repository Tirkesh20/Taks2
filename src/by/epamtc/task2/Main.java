package by.epamtc.task2;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.enums.Colors;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.service.Services;

public class Main {


    public static void main(String[] args) throws NoMuchFound {
        Basket basket=new Basket();
        Ball ball=new Ball();
        ball.setColor(Colors.BLUE);
        ball.setWeight(2.4);
        Ball ball2=new Ball();
        ball2.setColor(Colors.BLUE);
        ball2.setWeight(3);
        Ball ball3=new Ball();
        ball3.setColor(Colors.BLACK);
        ball3.setWeight(5);
        basket.addBall(ball,ball.getColor());
        basket.addBall(ball2,ball2.getColor());
        basket.addBall(ball3,ball3.getColor());
        System.out.println(basket.getList((ball3.getColor())));
        Services services =new Services(basket);
        System.out.println(services.ballsWeightCounter());
    }
}
