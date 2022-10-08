package task7;

import task7.services.Reader;
import task7.services.Sorter;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int[] inputArray = reader.getArrayFromConsole();
        Sorter sorter = new Sorter();
        System.out.println(Arrays.toString(sorter.sort(inputArray)));
    }
}
