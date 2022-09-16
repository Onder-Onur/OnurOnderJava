package HomeworksAll;

public class Homework8 {
    public static void main(String[] args) {
        //Write a code with following requirements:
        //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
        //- Print the minimum number in the given array

        int [] num = {6,7,2,3,90,-2,-90,-122,96,-350};
        int minNum = num[0];

        for (int i = 0; i < num.length ; i++) {
            if(minNum>num[i]){
                minNum = num[i];
            }
        }
        System.out.println("The minimum number in the given array is: " + minNum);
    }
}
