package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Homework28 {
    //Write a method where it takes a String and returns to a String by adding
    // "Not" in front of the String only if It does not have "Not" in front of it already.
    //
    //ex. a = "CAR'
    // notString("Car" )  == > "Not Car"
    // notString("Home"). ==> "Not Home"
    // notString("Not Home") == > "Home"

    public static String notString(String a){
        String result = "";
        String test = a.substring(0,3);
        if(test.equals("Not")){
            result = a.substring(4);
        }else {
            result = "Not "+a;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string1 = input.nextLine();

        System.out.println(notString(string1));


    }

}
