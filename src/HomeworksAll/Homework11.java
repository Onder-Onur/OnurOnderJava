package HomeworksAll;

import java.util.Arrays;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        //Write   a   program   that   creates   an   array   of   10   elements   size.
        //   Your   program   should   prompt   the   user   to   input   numbers   in   array
        //   and   then   display   the   sum   of   all array   elements.

        Scanner input = new Scanner(System.in);
        int [] numbers = new int [10];
        System.out.println("Please input 10 numbers: ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i+1) +": ");
            numbers[i] = input.nextInt();
            sum+= numbers[i];
        }
        System.out.println("Here is your Array "+ Arrays.toString(numbers) +" and the sum of these numbers is "+ sum);


    }
}
