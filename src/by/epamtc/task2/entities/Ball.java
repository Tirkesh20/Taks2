package by.epamtc.task2.entities;

import by.epamtc.task2.enums.Colors;

import java.util.Objects;

public class Ball {
    private double weight;
    private Colors color;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
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
        return Objects.hash(weight,color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 && Objects.equals(color, ball.color);
    }

}
