package by.epamtc.task2;

import by.epamtc.task2.beanCreater.BallCreator;
import by.epamtc.task2.beanCreater.BasketCreator;
import by.epamtc.task2.model.Ball;
import by.epamtc.task2.model.Basket;
import by.epamtc.task2.enums.Color;
import by.epamtc.task2.exception.IllegalArgumentException;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.exception.OverweightException;
import by.epamtc.task2.scanners.Scanners;
import by.epamtc.task2.service.CommonServices;
import by.epamtc.task2.service.DefaultServices;

public class Test {


    public static void main(String[] args) throws NoMuchFound, IllegalArgumentException, OverweightException {
        System.out.println("create basket");
        Basket basket=BasketCreator.createBasket();
        CommonServices services=new DefaultServices(basket);
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
                    basket.addBall(ball);
                }
                case 2 -> {
                    System.out.println("enter the color of ball to count");
                    String color = Scanners.StringScanner();
                    System.out.println(services.getCount(color));
                }
                case 4 -> {
                    flag = true;
                }
            }
        }while (!flag);
    }
}
