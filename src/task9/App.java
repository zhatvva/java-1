package task9;

import task9.entities.Ball;
import task9.services.BasketService;

public class App {
    public static void main(String[] args) {
        Ball firstBall = new Ball(6.2, Ball.BLUE);
        Ball secondBall = new Ball(2, Ball.BLUE);
        Ball thirdBall = new Ball(2, Ball.RED);

        BasketService basketService = new BasketService();
        basketService.addBall(firstBall);
        basketService.addBall(secondBall);
        basketService.addBall(thirdBall);

        System.out.println("Count of the blue balls: " + basketService.getBlueBallsCount());
        System.out.println("Weight: " + basketService.getWeight());
    }
}
