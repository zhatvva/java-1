package task6.services;

import java.util.Scanner;

public class IOProvider {
    private final Scanner scanner;

    public IOProvider(){
        this.scanner = new Scanner(System.in);
    }

    public int getArrayLengthFromConsole() {
        System.out.print("Input array length: ");
        return scanner.nextInt();
    }

    public int[] getArrayFromConsole(int arrayLength) {

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Input array[" + i + "] ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public void printMatrixToConsole(int[][] matrix, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
