package task5;

import task5.services.Reader;
import task5.services.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator service = new Calculator();
        Reader reader = new Reader();
        int[] inputArray = reader.getInputFromConsole();
        int unnecessaryNumbersCount = service.removedNumbersCount(inputArray);
        System.out.println(unnecessaryNumbersCount);
    }
}
