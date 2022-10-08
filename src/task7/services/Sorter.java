package task7.services;

public class Sorter {
    public int[] sort(int[] vector) {
        int step = vector.length / 2;
        while (step > 0) {
            int i, j;
            for (i = step; i < vector.length; i++) {
                int value = vector[i];
                for (j = i - step; (j >= 0) && (vector[j] > value); j -= step)
                    vector[j + step] = vector[j];
                vector[j + step] = value;
            }
            step /= 2;
        }
        return vector;
    }
}
