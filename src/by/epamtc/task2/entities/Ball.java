package by.epamtc.task2.entities;

import by.epamtc.task2.enums.Color;

import java.util.Objects;

public class Ball {
    private double weight;
    private Color color;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        int result=21;
        result=16*result+Double.hashCode(weight);
        result=16*result+color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        if(Double.compare(ball.weight,weight)==0)return true;
        return Objects.equals(color,ball.color);
    }

}
