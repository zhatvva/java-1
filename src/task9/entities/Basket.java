package task9.entities;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> balls;
    public List<Ball> getBalls() {
        return balls;
    }

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }
}
