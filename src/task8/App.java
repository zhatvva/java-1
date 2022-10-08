package task8;

import task8.services.Generator;
import task8.services.Inserter;

public class App {
    public static void main(String[] args) {
        Generator generator = new Generator();
        var firstArray = generator.generateArray();
        var secondArray = generator.generateArray();
        new Inserter().insert(firstArray, secondArray);
    }
}
