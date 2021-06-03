package by.epamtc.task2;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.enums.Colors;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.service.Services;

public class Test {


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
        Ball ball4=new Ball();
        ball4.setColor(Colors.BLUE);
        ball4.setWeight(2.4);
        Ball ball5=new Ball();
        ball5.setColor(Colors.BLUE);
        ball5.setWeight(2.4);
        Ball ball6=new Ball();
        ball6.setColor(Colors.BLUE);
        ball6.setWeight(2.4);
        Ball ball7=new Ball();
        ball7.setColor(Colors.BLUE);
        ball7.setWeight(2.4);
        Ball ball8=new Ball();
        ball8.setColor(Colors.BLUE);
        ball8.setWeight(2.4);
        basket.addBall(ball,ball.getColor());
        basket.addBall(ball2,ball2.getColor());
        basket.addBall(ball3,ball3.getColor());
        basket.addBall(ball4,ball4.getColor());
        basket.addBall(ball5,ball5.getColor());
        basket.addBall(ball6,ball6.getColor());
        basket.addBall(ball7,ball7.getColor());
        basket.addBall(ball8,ball8.getColor());
        System.out.println(basket.getList((ball2.getColor())));
        Services services =new Services(basket);
        System.out.println(services.ballsWeightCounter());
        System.out.println(services.blueBallsCount());
    }
}
