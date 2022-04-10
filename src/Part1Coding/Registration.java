package Part1Coding;
// ⦁  Create Registration Class in which you would have variables as email,
// userName and password that have an access scope only within its own class.
// After creating an object of the class user should be able to call methods
// and in each method separately pass values to set users email, username and password.
// Requirements:
// A. Valid email consider to be only yahoo
// B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
// Also valid password cannot contain userName.

public class Registration {
    private String email;
    private String userName;
    private String password;
    public void email(String email){
        if(email.equals("yahoo")){
            System.out.println("valid email");
        }else{
            System.out.println("Valid email is only considered to be yahoo.com");
        }
    }
    public void setUserName(String userName) {
        if (!userName.isEmpty()&&userName.length ()>6) {
            System.out.println("valid username");

        }
        else {
            System.out.println("username could not be empty");
        }
    }
    public void password(String password){
        if(password.isEmpty()&&!userName.contains ( password )){
            if(password.length ()>6)
                System.out.println("valid password account registered");
        }else{
            System.out.println("username could not be empty");
        }
    }
    public static void main(String[] args) {
        Registration user=new Registration ();
        user.email("yahoo");
        user.setUserName("Tester123");
        user.password("Holcomb1234");
    }
}