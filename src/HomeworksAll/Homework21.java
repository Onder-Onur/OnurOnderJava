package HomeworksAll;

public class Homework21 {
    //Write a method where it takes 2 strings as a parameter
    // and returns true when 2 strings are equal
    // and return false when they are not equal.

    public static boolean Equal(String first, String second){
        boolean result;
        if(first.equals(second)){
            result=true;
        }else {
            result=false;
        }
        return result;

    }
    public static void main(String[] args) {
        String name = "Onur";
        String name1 = "Onur";
        String name2 = "Ziya";
        boolean result;
        boolean result1;
        result = Equal(name,name1);
        result1 = Equal(name,name2);
        System.out.println("First result is "+result);
        System.out.println("Second result is "+result1);
    }
}
