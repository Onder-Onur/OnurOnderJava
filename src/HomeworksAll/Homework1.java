package HomeworksAll;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //- Write a code where user is asked to enter a integer number
        //- print all the numbers that can NOT be divided by 2, or 5 and
        // Also can be divided by 7 between 1 to entered number(included) (use the Continue Statement)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");

        int num = input.nextInt();

        for (int i = 0; i <= num ; i++) {

            if(i % 2 == 0 || i % 5 == 0 || i % 7 == 0){
                continue;
            }else {
                System.out.print(i + " ");
            }

        }
    }
}
