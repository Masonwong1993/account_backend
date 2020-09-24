public class User {
    private String email;
    private String password;
    private String name;
    //private int birthmonth;
    //private int birthyear;
    private String birthdate;
    private String gender;

//    public User(String name, String email, String password, String birthdate, String gender){
//        this.email = email;
//        this.password = password;
//        this.gender = gender;
//        this.birthdate = birthdate;
//        this.name = name;
//    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }

}
