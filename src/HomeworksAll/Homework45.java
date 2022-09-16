package HomeworksAll;

import java.util.Scanner;
import java.util.Stack;

public class Homework45 {
    //Write a method where it takes String s as a parameter and returns that the
    // Brackets and Parentheses are opened and closed properly. every opened brackets
    // or parentheses should be closed, if so it returns true else it returns false.
    //examples:
    //}{}()[] ---> false
    //(){}[] --- > true
    //{([])} ----> true
    //{({{}])} ----> false
    //PS --> This is not an Easy Question. It requires a lot of thinking and logic.
    // (Stack is one of the best way to do this. Remember pop(), push(), peek(), empty().
    // This was one of the interview question for developer interview.
    // It is normal for you not to be able to do it. Do not get discouraged if you can not do it)
    // We can solve this later on together.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a parentheses or brackets sequence: ");
        String userInput = sc.nextLine();

        System.out.println(CheckParaAndBrac(userInput));
    }

    public static boolean CheckParaAndBrac(String str){
        boolean result=true;

        Stack<Character> openning = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(x=='('||x=='{'||x=='['){
                openning.push(x);
                continue;
            }

            char control;
            switch (x){
                case')':
                    control=openning.pop();
                    if(control=='['||control=='{')
                        return false;
                        break;
                case']':
                    control=openning.pop();
                    if(control=='('||control=='{')
                        return false;
                        break;
                case'}':
                    control=openning.pop();
                    if(control=='('||control=='[')
                        return false;
                    break;

            }

        }
        if (openning.isEmpty()){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}
