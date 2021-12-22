package by.epamtc.task2.service;

import by.epamtc.task2.model.Ball;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface CommonServices {
    double ballsWeightCounter(Map<Color, ArrayList<Ball>> map) throws IllegalArgumentException;
    Color stringToColor(String color) throws IllegalArgumentException;
    List<Ball> getListOfBalls(String color) throws NoMuchFound, IllegalArgumentException;
    long getCount(String color) throws IllegalArgumentException;
}
