package task3.services;

import task2.entities.Point;
import task3.entities.Argument;

import java.util.Scanner;

public class Reader {
    public Argument getInputFromConsole() {
        System.out.print("Input a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input h: ");
        double h = scanner.nextDouble();
        return new Argument(a, b, h);
    }
}
