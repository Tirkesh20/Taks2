package by.epamtc.task2.beanCreater;

import by.epamtc.task2.entities.Ball;
import by.epamtc.task2.enums.Color;
import by.epamtc.task2.exception.IllegalArgumentException;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.scanners.Scanners;
import by.epamtc.task2.service.Services;

public class BallCreator {
        public static Ball createBall() throws NoMuchFound {
        Ball ball=new Ball();
                        String color;
                        do {
                                color=Scanners.StringScanner();
                        }while (!Services.isColor(color));
                        ball.setColor(Color.valueOf(color.toUpperCase()));
                        double weight=Scanners.positiveDouble();
                        ball.setWeight(weight);
                        return ball;
    }

    public  static Ball createBall(String color,double weight) throws IllegalArgumentException {
            if (!Services.isColor(color)){
                throw new IllegalArgumentException();
            }
            if (weight<=0){
                throw new IllegalArgumentException();
            }
            Ball ball=new Ball();
            ball.setColor(Color.valueOf(color.toUpperCase()));
            ball.setWeight(weight);
            return ball;
    }
}
