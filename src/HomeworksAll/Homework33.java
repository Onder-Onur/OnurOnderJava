package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;


public class Homework33 {
    //Write a Method wehere it takes String and return ArrayList of All the numbers in the String
    //ex: String str = "This234 is ju3st St1in6"
    //srrlsit = {2,3,4,3,1,6};
    //hint in order to check if Character is a number or not ( boolean check = Character.isDigit(str.charAt(i))

    public static ArrayList<String> ReturnNumbers(String numbers){
        ArrayList<String > result = new ArrayList<>();

        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))){
                result.add(String.valueOf(numbers.charAt(i)));
            }else {
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence = "This234 is ju3st St1in6";
        ArrayList<String> result = ReturnNumbers(sentence);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
