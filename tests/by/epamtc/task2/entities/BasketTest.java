package by.epamtc.task2.entities;

import by.epamtc.task2.exception.IllegalArgumentException;
import by.epamtc.task2.exception.OverweightException;
import by.epamtc.task2.model.Basket;
import org.junit.Before;
import org.junit.Test;

import static by.epamtc.task2.beanCreater.BallCreator.createBall;
import static org.junit.Assert.*;

public class BasketTest {

    Basket basket=new Basket(3);

    @Before
    public void before() throws IllegalArgumentException, OverweightException {
        basket.addBall(createBall("red",3));
        basket.addBall(createBall("blue",2));
        basket.addBall(createBall("white",1));
    }

    @Test(expected =OverweightException.class )
    public void addBallWhenBasketIsFull() throws IllegalArgumentException, OverweightException {
       basket.addBall(createBall("yellow",1));
    }

    @Test()
    public void ballsWeightCounter() {
        double expected=6;
        double actual=basket.ballsWeightCounter();
        assertEquals(expected,actual,0.01);
    }
}