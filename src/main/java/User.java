public class User {
    private String email;
    private String password;
    private String name;
    private int birthmonth;
    private int birthyear;
    private int birthdate;
    private String gender;

    private void setEmail(String email){
        this.email = email;
    }
    private void setPassword(String password){
        this.password = password;
    }
    private void setName(String name){
        this.name = name;
    }
    private void setGender(String gender){
        this.gender = gender;
    }
    private void setBirthmonth(int birthmonth){
        this.birthmonth = birthmonth;
    }
    private void setBirthyear(int birthyear){
        this.birthyear = birthyear;
    }
    private void setBirthdate(int birthdate){
        this.birthdate = birthdate;
    }

}
