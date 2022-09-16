package HomeworksAll;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //- Write a code where user is asked to enter a number
        //- Print the even sum of the even numbers from 0 to entered number(included) but the Sum should not pass 390

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");

        int num = input.nextInt();
        int sum = 0;
        String evenNumbers="";
        for (int i = 0; i <= num ; i+=2) {
            evenNumbers+=i + " ";
        }
        for (int i = 0; i <= num; i+=2) {
            if(sum + i>390){
                break;
            }else {
                sum+=i;
            }
        }
        System.out.println("Even numbers between 0 to " + num + " :" +evenNumbers);
        System.out.println("The sum of the even numbers from 0 to "+ num + " with the rule sum must be less then 390 is: " + sum);
    }
}