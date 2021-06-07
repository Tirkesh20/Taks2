package by.epamtc.task2.enums;

public enum Color {
    YELLOW("YELLOW"),
    GREEN("GREEN"),
    PURPLE("PURPLE"),
    WHITE("WHITE"),
    BLUE("BLUE"),
    RED("RED");

    private String color;

    Color(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
