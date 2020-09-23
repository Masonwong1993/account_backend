public class User {
    private String email;
    private String password;
    private String name;
    private int birthmonth;
    private int birthyear;
    private int birthdate;
    private String gender;

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
    public void setBirthmonth(int birthmonth){
        this.birthmonth = birthmonth;
    }
    public void setBirthyear(int birthyear){
        this.birthyear = birthyear;
    }
    public void setBirthdate(int birthdate){
        this.birthdate = birthdate;
    }

}
