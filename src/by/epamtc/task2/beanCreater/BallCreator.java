package by.epamtc.task2.beanCreater;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.enums.Color;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.scanners.Scanners;
import by.epamtc.task2.service.Services;

public class BallCreator {
        public static Ball createBall() throws NoMuchFound {
        Ball ball=new Ball();
        System.out.println("enter the color of the Ball");
                        String color;
                        do {
                                color=Scanners.StringScanner();
                        }while (!Services.isColor(color));
                        ball.setColor(Color.valueOf(color.toUpperCase()));
                System.out.println("Enter weight of the ball");
                        double weight=Scanners.positiveDouble();
                        ball.setWeight(weight);
                        System.out.printf("ball created with color %s and  weight %f\n",ball.getColor(),weight);
                        return ball;
    }
}
