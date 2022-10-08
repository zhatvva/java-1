package task8.services;

import java.util.ArrayList;
import java.util.Scanner;

public class Generator {
    public ArrayList<Integer> generateArray() {
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print("Input n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            result.add(scanner.nextInt());
        }
        return result;
    }
}
