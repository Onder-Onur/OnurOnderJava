package HomeworksAll;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        //Write   a   Java   program   to   reverse   the   element   of   an   integer    array.

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int [] newNumbers = new int [10];
        int temp = numbers[0];
        int k = numbers.length-1;
        for (int i = 0; i < numbers.length/2; i++) {
            newNumbers[i] =  numbers[k];
            newNumbers[k] = temp;
            temp = numbers[i+1];
            k-=1;
        }
        System.out.println("The given array is " + Arrays.toString(numbers)+ " and reverse array is "+Arrays.toString(newNumbers));;
    }
}
