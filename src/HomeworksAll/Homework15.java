package HomeworksAll;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        //Write a code where it ask user to enter a Sentence,
        // Find the longest word in the sentence and print it with the length of it.
        //ex. ,"I love being outside with my dog but I have a lot to do today"
        //asnwer: Outside and the length is 7

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String userInput = input.nextLine();
        int charCounter = 0;
        int longestWordIndex = 0;

        String [] sentenceArray = userInput.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {
            if(sentenceArray[i].length()>sentenceArray[longestWordIndex].length()){
                longestWordIndex = i;
                charCounter = sentenceArray[i].length();
            }
        }

        System.out.println("The longest word in this sentence is "+sentenceArray[longestWordIndex] + " and the length of this word is " + charCounter);

    }
}
