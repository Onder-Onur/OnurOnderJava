package HomeworksAll;

import java.util.Scanner;

public class Homework26 {
    //Write a method that takes the day as an integer such as
    // (1 for Monday, 2 for Tuesday, and so on) and
    // it returns a String value indicating "Go To Work" for weekdays
    // and "Go Back to Sleep" weekends. Name your Method as (GotoSleeporWork)

    public static String GotoSleeporWork(int day){
        String result="";
        if(day>0&&day<6){
            result = "Go To Work";
        }else if(day>5&&day<8){
            result = "Go Back to Sleep";
        }else {
            result = "Please enter a valid weekday.";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day of the week: (1 for Monday, 2 for Tuesday, and so on.)");
        int dayOfTheWeek = input.nextInt();

        String message = GotoSleeporWork(dayOfTheWeek);
        System.out.println(message);
    }
}

