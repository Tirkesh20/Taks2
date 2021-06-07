package by.epamtc.task2;

import by.epamtc.task2.beanCreater.BallCreator;
import by.epamtc.task2.beanCreater.BasketCreator;
import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.enums.Color;
import by.epamtc.task2.exception.IllegalArgumentException;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.scanners.Scanners;
import by.epamtc.task2.service.Services;

public class Test {


    public static void main(String[] args) throws NoMuchFound, IllegalArgumentException {
        System.out.println("create basket");
        Basket basket=BasketCreator.createBasket();
        Services services=new Services(basket);
        boolean flag=false;
        do {
            System.out.println("enter action\n");
            System.out.println("1. create and add ball to basket");
            System.out.println("2.get  balls count");
            System.out.println("3.get weights of balls");
            System.out.println("4 leave");
            int action = Scanners.intScanner();
            switch (action) {
                case 1 -> {
                    Ball ball = BallCreator.createBall();
                    services.addBall(ball);
                    break;
                }
                case 2 -> {
                    System.out.println("enter the color of ball to count");
                    String color = Scanners.StringScanner();
                    System.out.println(services.getCount(color));
                    break;
                }
                case 3 -> {
                    System.out.println(services.ballsWeightCounter());
                    break;
                }
                case 4 -> {
                    flag = true;
                }
            }
        }while (!flag);
    }
}
