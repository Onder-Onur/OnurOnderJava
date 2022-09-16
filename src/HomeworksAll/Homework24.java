package HomeworksAll;

import java.util.Arrays;

public class Homework24 {

    //Write a method where it takes 2 integer arrays as parameters,
    // and returns to the an integer array where it includes
    // 2 highest different values in the first array
    // and 2 lowest different values in the second array.

    public static int[] newArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr3 = new int[4];

        arr3[0] = arr1[arr1.length - 1];
        firstloop:
        for (int i = arr1.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr1[i] != arr1[j]) {
                    arr3[1] = arr1[j];
                    break firstloop;
                }
            }
        }
        arr3[2] = arr2[0];
        secondloop:
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] != arr2[j]) {
                    arr3[3] = arr2[j];
                    break secondloop;
                }
            }
        }
        return arr3;

    }

    public static void main(String[] args) {

        int[] arr1 = {6, 6, 3, 6, 1, 2, 3, 6, 5, 5};
        int[] arr2 = {3, 4, 5, 6, 4, 3, 7, 8, 3};
        int[] arr3 = newArray(arr1, arr2);

        System.out.println(Arrays.toString(arr3));
    }
}
