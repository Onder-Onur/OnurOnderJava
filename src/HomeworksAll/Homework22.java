package HomeworksAll;

import java.util.Arrays;

public class Homework22 {
    //Write a method where it takes array of integers and returns the sorted version of that array

    public static int [] SortedArray(int [] arr1){
        Arrays.sort(arr1);
        int [] sorted = arr1;
        return sorted;
    }

    public static void main(String[] args) {
        int [] myArray = {4,7,2,3,1,5,8,6,9,10};

        int[] sortedArray = SortedArray(myArray);

        System.out.println(Arrays.toString(sortedArray));

    }
}
