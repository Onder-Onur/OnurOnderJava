package HomeworksAll;

public class Homework29 {
    //Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string,
    // but also could handle a situation where It takes 2 String
    // and 1 integer value where it only prints the 2 strings by integer value times.
    //ex -  ConcatandPrint("FirstName","LastName") it will return ==> FirstNameLastName
    //  	  ConcatandPrint("FirstName","LastName", 3) it will print ==> "FirstName" and "Lastname" 3 times.
    public static String ConcatandPrint(String fString, String sString){
        String result = fString+" "+sString;
        return result;
    }

    public static void ConcatandPrint(String fString, String sString,int repeat){
        String result = fString+" "+sString;

        for (int i = 0; i < repeat; i++) {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        String name = ConcatandPrint("Onur","Onder");
        System.out.println(name);

        ConcatandPrint("Ziya","Yilmaz",3);
    }
}
