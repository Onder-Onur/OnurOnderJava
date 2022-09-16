package HomeworksAll;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework31 {
    //Write a Method where it takes an Integer of ArrayList and returns to an Integer ArrayList where it contains only unique numbers
    //ex:   list==>   {1,1,2,3,3,4,5,6}
    //      uniques   ==>   {2,4,5,6}

    public static ArrayList<Integer> UniceNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if(Collections.frequency(numbers,numbers.get(i))==1){
                result.add(numbers.get(i));
            } else {
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,3,3,4,5,6));
        ArrayList<Integer> result = UniceNumbers(numbers);

        System.out.println(Arrays.toString(result.toArray()));
    }
}
