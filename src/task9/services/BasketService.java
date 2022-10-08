package task9.services;

import task9.entities.Ball;
import task9.entities.Basket;

public class BasketService {
    private final Basket basket;

    public BasketService() {
        basket = new Basket();
    }

    public void addBall(Ball ball) {
        basket.getBalls().add(ball);
    }

    public long getBlueBallsCount() {
        return basket.getBalls().stream().filter(ball -> ball.getColor().equals(Ball.BLUE)).count();
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < basket.getBalls().size(); i++)
            weight += basket.getBalls().get(i).getWeight();
        return weight;
    }
}
