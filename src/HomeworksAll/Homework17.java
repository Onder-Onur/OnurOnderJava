package HomeworksAll;

import java.util.Arrays;
import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter 10 numbers and store those number in the integer array.
        // Print the the max number and all the element in the array(Yo can use Arrays.toString() method)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 integer numbers");
        int [] numbers = new int [10];
        String numbersToPrint="";
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter number " + (i+1));
            numbers[i] = input.nextInt();
        }
        numbersToPrint = (Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] < numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Your numbers are "+ numbersToPrint);
        System.out.println("The maximum number is "+ numbers[0]);

    }
}
