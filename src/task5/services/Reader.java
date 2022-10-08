package task5.services;

import java.util.Scanner;

public class Reader {
    public int[] getInputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input array[" + i + "] ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
