package HomeworksAll;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //- Write a code where user is asked to enter a string
        //- create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
        //- print the new string

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string All Capital please: ");
        String userString = input.nextLine();
        String newString = "";

        for (int i = 0; i < userString.length()-1 ; i++) {
            if(userString.charAt(i) == 'L' || userString.charAt(i) == 'M' || userString.charAt(i) == 'T' || userString.charAt(i) == 'E'){
                continue;
            }else {
                newString += userString.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
