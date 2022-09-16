package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework34 {
    //Write a method where it takes ArrayList of Stings and and the index, returns to the element of that index in the ArrayList

    public static String ReturnIndexElement(ArrayList<String> names,int index){
        String result = names.get(index);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> namesList= new ArrayList<>();

        namesList.addAll(Arrays.asList("Onur", "Berivan", "Deniz"));

        System.out.println(ReturnIndexElement(namesList,2));
    }
}
