package HomeworksAll;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        //Write a code where the the user is asked to enter an integer number
        //- sum of all the odd numbers between 1 to given number (included)
        // but exclude the 9,11,23,35 from the total sum if those numbers happens to be in the range of 1 to given number.
        //- The sum should not exceed 300
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");

        int num = input.nextInt();
        int sum = 0;
        String oddNumbers="";
        for (int i = 1; i <= num ; i+=2) {
            oddNumbers+=i + " ";
        }
        for (int i = 1; i <= num ; i+=2) {
            if (i==9||i==11||i==23||i==35){
                continue;
            }else {
                sum+=i;
                if (sum+i>300){
                    break;
                }
            }
        }
        System.out.println("Odd numbers between 0 to "+num+" : " + oddNumbers);
        System.out.println("The sum of the odd numbers from 0 to "+num+" with the rule sum must be less then 300 and exclude the 9,11,23,35 is:" + sum);
    }
}
