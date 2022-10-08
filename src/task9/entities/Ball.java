package task9.entities;

public class Ball {
    private final double weight;
    public double getWeight() {
        return weight;
    }

    private final String color;
    public String getColor() {
        return color;
    }
    public final static String BLUE = "blue";
    public final static String RED = "red";

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
