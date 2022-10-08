package task6;

import task6.services.Generator;
import task6.services.IOProvider;

public class App {
    public static void main(String[] args){
        IOProvider provider = new IOProvider();
        int arrayLength = provider.getArrayLengthFromConsole();
        int[] array = provider.getArrayFromConsole(arrayLength);

        Generator generator = new Generator();
        var matrix = generator.generateMatrix(array, arrayLength);

        provider.printMatrixToConsole(matrix, arrayLength);
    }
}
