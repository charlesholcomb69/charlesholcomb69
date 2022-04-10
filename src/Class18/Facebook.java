package Class18;

public class Facebook {
    // break till 9:00
    private String userName;
    private String password;
    private  int age;
    void setAge(int personAge){
        if(personAge>13&& personAge<120){
            age=personAge;
        }else {
            System.out.println("Not " +
                    "allowed its not a Horse");
        }
    }

    int getAge(String userPassword){
        //protecting the age with a password
        if(userPassword.equals(password)){
            return age;
        }else {
            return -1;
        }


    }


}
