package HomeworksAll;

import java.util.Arrays;

public class Homework16 {
    public static void main(String[] args) {
        //Write a code where you short all the integer values in an array in descending order (Do not use the Arrays.short() )
        int [] numbers = {10,90,32,4,60,6,7,80,9,11};
        int temp = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] < numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
