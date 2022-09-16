package HomeworksAll;

import java.util.Arrays;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        // Write a code where user is asked to enter for 5 employee salaries and store those salaries
        //Then find the average salary of those 5 employees

        Scanner input = new Scanner(System.in);
        System.out.println("This application will calculate the average salary for 5 employee");
        double [] salarries = new double [5];
        double sum = 0;
        double average = 0;

        for (int i = 0; i < salarries.length; i++) {
            System.out.println("Please enter the salary for employee " + (i+1)+ ":");
            salarries[i] = input.nextDouble();
            sum+=salarries[i];
            average = (double) (sum / salarries.length);
        }
        System.out.println("Your entries for 5 employeees are: "+ Arrays.toString(salarries));
        System.out.println("Avarage salary for these 5 salaries is " + average);
    }
}