package task2.services;

import task2.entities.Point;
import java.util.Scanner;

public class Reader {
    public Point getInputFromConsole() {
        System.out.print("Input x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Input y: ");
        int y = scanner.nextInt();
        return new Point(x, y);
    }
}
