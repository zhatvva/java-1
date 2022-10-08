package task6.services;

public class Generator {
    public int[][] generateMatrix(int[] userArray, int arrayLength) {
        int firstElement = 0;
        int[][] matrix = new int[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.arraycopy(userArray, 0, matrix[i], 0, arrayLength);
            firstElement = userArray[0];
            for (int j = 0; j < arrayLength - 1; j++) {
                userArray[j] = userArray[j+1];
            }
            userArray[arrayLength-1] = firstElement;
        }
        return matrix;
    }
}
