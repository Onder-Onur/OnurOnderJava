package HomeworksAll;

public class Homework38{
    //Write a Class named "Login" where it has private data members of String Username and String Password.
    //Create another Class where you create instance (Object) of Login class,  set those private data members Then Print Those Values
    public static void main(String[] args) {
        Homework38Login obj = new Homework38Login();
        obj.setUsername("Onur Onder");
        obj.setPassword("This is the Password");

        System.out.println(obj);
    }


}
