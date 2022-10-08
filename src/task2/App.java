package task2;

import task2.entities.Point;
import task2.services.Calculator;
import task2.services.Reader;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Reader reader = new Reader();
        Point point = reader.getInputFromConsole();
        boolean result = calculator.isInArea(point.getX(), point.getY());
        System.out.println(result);
    }
}
