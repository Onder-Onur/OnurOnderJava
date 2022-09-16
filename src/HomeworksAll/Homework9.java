package HomeworksAll;

public class Homework9 {
    public static void main(String[] args) {
        //write a code with following requirements
        //- define an array with following values {90,34,23,87,45,36,98}
        //- Print the values that can be divided by 2 or 3

        int [] num = {90,34,23,87,45,36,98};
        System.out.print("These are the values that can be divided by 2 or 3 in the given array: ");
        for (int i = 0; i < num.length ; i++) {
            if(num[i]%2 == 0 || num[i]%3 == 0){
                System.out.print(num[i]+ " ");
            }else {
                continue;
            }
        }
    }
}
