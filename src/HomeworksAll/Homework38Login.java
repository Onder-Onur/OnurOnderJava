package HomeworksAll;

public class Homework38Login {
    //Write a Class named "Login" where it has private data members of String Username and String Password.
    //Create another Class where you create instance (Object) of Login class,  set those private data members Then Print Those Values
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String toString(){
        String result = "Username: "+ Username + "\nPassword: "+ Password;
        return result;

    }
}


