import java.util.ArrayList;

public class DAO {
    private ArrayList<User> Userlist = new ArrayList<User>();
    public void addUser(User user) {
        Userlist.add(user);
    }

    public void removeUser(String email) {
        for (User user : Userlist)
        {
            if (user.getEmail().equals(email))
            {
                Userlist.remove(user);
            }
        }
    }

    public void updateContact(User user, String name, String email, String password, String gender, String birthdate) {
        user.setGender(gender);
        user.setPassword(password);
        user.setName(name);
        user.setEmail(email);
        user.setBirthdate(birthdate);
    }

    public void printUsers(){
        for (User user : Userlist){
            System.out.println(user.getName());
            System.out.println(user.getGender());
            System.out.println(user.getEmail());
            System.out.println(user.getBirthdate());

        }

    }
}
