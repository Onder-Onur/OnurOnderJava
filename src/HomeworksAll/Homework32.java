package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework32 {
    //Write methods where it takes the ArrayList of Double
    //1) first method returns to max number
    //2) second metod returns to min number
    //3) third Method prints all element one by one on the same line ( ex = the List is: 100.9, 12.45, 30.46 )

    public static Double Max(ArrayList<Double>a){
        Double max = Collections.max(a);
        return max;
    }
    public static Double Min(ArrayList<Double>a){
        Double min = Collections.min(a);
        return min;
    }

    public static void Print(ArrayList<Double>a){
        System.out.print("the List is: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+", ");
        }
    }



    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100.9, 12.45, 30.46));
        Double resultMax = Max(numbers);
        Double resultMin = Min(numbers);
        System.out.println(resultMax);
        System.out.println(resultMin);
        Print(numbers);
    }
}
