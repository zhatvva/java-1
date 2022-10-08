package task4.services;

public class Calculator {
    private final Reader reader;

    public Calculator() {
        reader = new Reader();
    }

    public void getIndexesOfPrimeNumbers() {
        int[] array = reader.getArrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            if(isPrime(array[i]))
                System.out.println(i);
        }
    }

    private boolean isPrime(int num) {
        if (num <= 0)
            return false;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
