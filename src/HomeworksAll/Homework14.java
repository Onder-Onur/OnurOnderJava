package HomeworksAll;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index
        // and put the the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int [] newNumbers = new int [10];
        int temp = numbers[0];
        int k = 1;
        for (int i = 0; i < numbers.length-1; i++) {
            newNumbers[i] =  numbers[k];
            k+=1;
        }
        newNumbers[newNumbers.length-1]= temp;
        System.out.println("The given array is " + Arrays.toString(numbers)+ " and shifted array is "+Arrays.toString(newNumbers));

    }
}
