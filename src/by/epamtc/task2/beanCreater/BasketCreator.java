package by.epamtc.task2.beanCreater;

import by.epamtc.task2.model.Basket;
import by.epamtc.task2.scanners.Scanners;

public class BasketCreator {

    public static Basket createBasket(){
        Basket basket=new Basket();
        System.out.println("enter the volume of the Basket");
        double val=Scanners.positiveDouble();
        basket.setVolume(val);
        return basket;
    }
}
