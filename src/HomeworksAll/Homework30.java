package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework30 {
    //Write a method where it takes 2 String arrays and returns to an ArrayList where it contains all of the elements of the Arrays
    //arr1   =   {"A",   "B",   "C"};
    //arr2   =   {"D",   "E",   "F",   "G"};
    //ist   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}

    public static ArrayList CombineArrays(String[]a, String[]b){
        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(a));
        combined.addAll(Arrays.asList(b));

        return combined;
    }

    public static void main(String[] args) {
        String [] arr1 = {"A",   "B",   "C"};
        String [] arr2 = {"D",   "E",   "F",   "G"};

        ArrayList<String> result = CombineArrays(arr1,arr2);
        System.out.println(Arrays.toString(result.toArray()));

    }
}
