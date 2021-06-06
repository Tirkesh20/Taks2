package by.epamtc.task2.beanCreater;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.scanners.Scanners;
import by.epamtc.task2.service.Services;

public class BallCreator {

        public Ball createBall() throws NoMuchFound {
        Ball ball=new Ball();
        System.out.println("enter the color of the Ball");
        String color=Scanners.StringScanner();
                if (Services.isColor(color)){
                        ball.setColor(Services.stringToColor(color));
                }else{
                        throw new IllegalArgumentException("Not a color");
                 }
        double weight=Scanners.positiveDouble();
        ball.setWeight(weight);
        return ball;
    }
}
