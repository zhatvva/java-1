package task5.services;

public class Calculator {
    public int removedNumbersCount(int[] initialArray) {

        if (initialArray.length == 1){
            return 0;
        }

        return numbersCount(initialArray);
    }

    private int numbersCount(int[] numbers){
        int resultCount = 0, currMaxNumber = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++){
            if (numbers[i + 1] <= currMaxNumber){
                resultCount++;
            }
            else{
                currMaxNumber = numbers[i + 1];
            }
        }

        return resultCount;
    }
}
