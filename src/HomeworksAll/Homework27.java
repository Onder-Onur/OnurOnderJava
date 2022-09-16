package HomeworksAll;

public class Homework27 {
    //We have two monkeys,   a   and b,   and the parameters aSmile and bSmile indicate if each is smiling.
    //We are in trouble if they are both smiling or if neither of them is smiling.   Return true if we are in
    //trouble.
    //monkeyTrouble(true,   true)   →   true
    //monkeyTrouble(false,   false)   →   true
    //monkeyTrouble(true,   false)   →   false

    public static boolean monkeyTrouble(boolean aSmile,boolean bSmile){
        boolean result;
        if((aSmile == true && bSmile==false) || (aSmile == false && bSmile==true)){
            result=false;
        } else {
            return true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false));
        System.out.println(monkeyTrouble(false,true));
    }
}
