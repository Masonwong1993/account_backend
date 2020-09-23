
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class accountUI {
    public static void main(String[] args) {
        User user = new User();
        email(user);
        name(user);
        password(user);
        gender(user);
        birthdate(user);

    }
    public static void email(User user){
        System.out.println("Please enter your email address : ");
        boolean trigger = true;
        while(trigger){
            Scanner scan = new Scanner(System.in);
            String email = scan.nextLine();
            String check = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            boolean isMatched = matcher.matches();
            if (isMatched) {
                user.setEmail(email);
                trigger = false;
            }
            else{
                System.out.println("Please enter a valid email address");
            }
        }
    }

    public static void name(User user){

        boolean trigger = true;
        while(trigger){
            System.out.println("Please enter your name : ");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            if (!name.equals("")){
                user.setName(name);
                trigger = false;
            }
        }

    }

    public static void password(User user){
        System.out.println("Please enter your password : ");
        boolean trigger = true;
        while(trigger){

            Scanner scan = new Scanner(System.in);
            String password = scan.nextLine();
            if (password.length() < 6){
                System.out.println("Passwords must be six or more characters");
            }
            else{
                user.setPassword(password);
                trigger = false;
            }
        }
    }

    public static void gender(User user){
        System.out.println("Please enter your gender : ");
        boolean trigger = true;
        while(trigger){

            Scanner scan = new Scanner(System.in);
            String gender = scan.nextLine();
            if (!gender.equals("male") && !gender.equals("female") && !gender.equals("prefer not to say")){
                System.out.println("Please enter valid gender");
            }
            else{
                user.setGender(gender);
                trigger = false;
            }
        }
    }

    public static void birthdate(User user){
        System.out.println("Please enter your birthdate : (yyyy-MM-dd)");
        boolean trigger = true;
        while(trigger){

            Scanner scan = new Scanner(System.in);
            String birthdate = scan.nextLine();
            try {
                SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                format.setLenient(false);
                Date date = format.parse(birthdate);

            } catch (Exception e){
                System.out.println("Please enter a valid date : ");
                continue;
            }
            user.setBirthdate(birthdate);
            trigger = false;

        }
    }






}
