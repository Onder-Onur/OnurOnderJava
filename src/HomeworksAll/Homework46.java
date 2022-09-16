package HomeworksAll;

public class Homework46 {
    //As a user I want to add a number of minutes to a time represented as a String.
    //
    //Without using any built-in date or time functions, write a function or method that accepts two
    //mandatory arguments along with tests to verify functionality.
    //
    //The first argument of the function is a 12-hour time string with the format [H]H:MM {AM|PM}
    //and the second argument is a signed integer indicating the number of minutes to add to the time
    //given in the first argument.
    //
    //The return value should be a string of the same format as the first argument. For example,
    //AddMinutes(9:10 AM, 200) would return 12:30 PM
    //
    //PS --> This is an actual Interview Question for Senior Level,
    // We can solve this together later on. It is a hard question,
    // If you can not do it, do not have disappointment.
    // It took me a little time to come up with the solution.
    // There are different ways to do it, The way I did was (using Character.isDigit) for the string.

    public static void main(String[] args) {

        System.out.println(AddMinutes("9:10 AM", 200));
    }

    public static String AddMinutes(String time, int add){
        String result;
        String [] wholeTime = time.split(" ");
        String [] hoursAndMinutes = wholeTime[0].split(":");
        String AmPm=wholeTime[1];
        int hour = Integer.parseInt(hoursAndMinutes[0]);
        int minutes = Integer.parseInt(hoursAndMinutes[1]);

        int additonalMinutes =  add%60;
        int additionalHours = (add-additonalMinutes)/60;

        hour +=additionalHours;
        minutes+=additonalMinutes;
        if(minutes>59){
            minutes= minutes-59;
            hour++;
        }
        if(hour>=24){
            hour=hour%24;
        }
        if (hour>=12){
            hour-=12;
            if(hour==0){
                hour=12;
            }
            if(AmPm.equals("AM")){
                AmPm="PM";
            }else {
                AmPm="AM";
            }
        }
        result = "The new time is: "+hour+":"+minutes +" "+ AmPm;

        return result;
    }
}
