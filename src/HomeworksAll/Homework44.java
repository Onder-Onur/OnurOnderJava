package HomeworksAll;

public class Homework44 {
    //Write a method where it takes String password and return true or false based on if the given password is valid.
    //Valid Password:
    //1) should contain at least one upper case
    //2) should contain at least one lower case
    //3) should have at least 8 characters
    //4) should contain at least on special characters ( Special Characters !,@,#,$,%,^,&,*,(,),-,_ and so on)
    //5) should contain at least one number

    public static boolean isValidPassword(String password) {

        boolean result;
        int minLenght = 8;
        int passLenght = password.length();
        int upperCase = 0;
        int lowerCase = 0;
        int speacialChar = 0;
        int space = 0;
        int digit = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperCase++;
            } else if (Character.isLowerCase(password.charAt(i))) {
                lowerCase++;
            } else if (Character.isWhitespace(password.charAt(i))) {
                space++;
            } else if (Character.isDigit(password.charAt(i))) {
                digit++;
            }else {
                speacialChar++;
            }
        }

        if (passLenght > minLenght && upperCase > 0 && lowerCase > 0 && speacialChar > 0 && space==0 && digit > 0 ) {
            result=true;
        }else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String pass = "Onuronder1@*";
        System.out.println(isValidPassword(pass));
    }
}
