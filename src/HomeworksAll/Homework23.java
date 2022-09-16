package HomeworksAll;

import java.util.Scanner;

public class Homework23 {
    //write a method where it takes 2 double values and 1 integer value.
    // When the integer value is 1 it returns to sum of the 2 double numbers,
    // when integer is 2 it returns the subtraction of those 2 double number,
    // when integer value is 3 it returns to the multiplication of those 2 double numbers,
    // and when the integer value is 4 it returns the division of those 2 double numbers
    public static double Calculator(double num1, double num2, int operation){

        double result =0;

        ext:
        while (true){
            switch (operation){
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                default:

            }
            break ext;
        }


        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        int a;
        String symbol = "";
        double result;
        ext:
        while (true) {
            System.out.println("Welcome to the Calculator");
            System.out.println("Please enter the first number: ");
            num1 = input.nextDouble();
            System.out.println("Please enter the second number: ");
            num2 = input.nextDouble();
            System.out.println("Please enter the operation: \n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 for exit the Calculator");
            a = input.nextInt();

            if (a == 1) {
                symbol = "+";
            } else if (a == 2) {
                symbol = "-";
            } else if (a == 3) {
                symbol = "*";
            } else if (a == 4) {
                symbol = "/";
            }else {
                System.out.println("Thank you for using my Calculator");
                break ext;
            }


            result = Calculator(num1, num2, a);
            System.out.println(num1 +symbol+ num2 +"=" + result);
        }

    }

}
