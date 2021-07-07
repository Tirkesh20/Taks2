package by.epamtc.task2.service;

import by.epamtc.task2.entities.Basket;
import by.epamtc.task2.exception.IllegalArgumentException;
import by.epamtc.task2.exception.NoMuchFound;
import by.epamtc.task2.exception.OverweightException;
import org.junit.Before;
import org.junit.Test;
import static by.epamtc.task2.beanCreater.BallCreator.createBall;
import static org.junit.Assert.assertEquals;

public class ServicesTest {
    Basket basket=new Basket(4);
    Services services=new Services(basket);

    @Before
    public void before() throws IllegalArgumentException, OverweightException {
     basket.addBall(createBall("red",3));
     basket.addBall(createBall("blue",2));
     basket.addBall(createBall("white",1));
     }

     @Test(expected = IllegalArgumentException.class)
    public void testIfArgumentIsNotColor() throws IllegalArgumentException {
        String color="bottle";
        double count=services.getCount(color);
    }
    @Test
    public void testWhenNoBallWithGivenColorAdded() throws NoMuchFound, IllegalArgumentException {
        String color="yellow";
        assertEquals(null,services.getCount(color));
    }



}