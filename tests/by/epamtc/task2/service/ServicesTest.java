package by.epamtc.task2.service;

import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.exception.IllegalArgumentException;
import by.epamtc.task2.exception.OverweightException;
import org.junit.Before;
import org.junit.Test;

import static by.epamtc.task2.beanCreater.BallCreator.createBall;

public class ServicesTest {
    Basket basket=new Basket(4);
    Services services=new Services(basket);
 @Before
    public void before() throws IllegalArgumentException, OverweightException {
     basket.addBall(createBall("red",3));
     basket.addBall(createBall("blue",2));
     basket.addBall(createBall("white",1));
 }

 @Test
 public void testIfBasketIsNull(){
 double expected;
 }

}