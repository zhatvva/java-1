package task1;

import java.util.Scanner;

public class Reader {
    public Input getInputFromConsole() {
        System.out.print("Input a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        return new Input(a, b);
    }
}
