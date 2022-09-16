package HomeworksAll;

public class Homework10 {
    public static void main(String[] args) {
        //Write   a   statement   that   declares   a   string   array   initialized   with   the   following   strings:
        //"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
        //Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.

        String [] weekdays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.print("\"These are the weekdays:");
        for (int i = 0; i < weekdays.length; i++) {
            System.out.print(" "+weekdays[i] );
        }
    }
}
