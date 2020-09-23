
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
        year(user);
        month(user);
        day(user);

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

    public static void year(User user){

        boolean trigger = true;
        while(trigger){
            boolean isvalid = false;
            System.out.println("Please enter your birthyear : ");
            Scanner scan = new Scanner(System.in);
            String birthyear = scan.nextLine();
            if (birthyear.length() == 0) {
                System.out.println("Please enter a valid year");
            }
            else {
                for (int i = 0; i < birthyear.length(); i++) {
                    if (!Character.isDigit(birthyear.charAt(i))) {
                        System.out.println("Please enter a valid year");
                        break;
                    }
                    if (i == birthyear.length()-1) isvalid = true;
                }
                if (isvalid) {
                    int y = 0;
                    for (int i = 0; i < birthyear.length(); i++) {
                        y = y*10 + birthyear.charAt(i)-'0';
                    }
                    //System.out.println(y);
                    if (y > 2020 || y < 1900){
                        System.out.println("Please enter a valid year");
                    }
                    else {
                        user.setBirthyear(y);
                        trigger = false;
                    }
                }
            }
        }
    }

    public static void month(User user){

        boolean trigger = true;
        while(trigger){
            boolean isvalid = false;
            System.out.println("Please enter your birthmonth : ");
            Scanner scan = new Scanner(System.in);
            String birthmonth = scan.nextLine();
            if (birthmonth.length() == 0) {
                System.out.println("Please enter a valid month");
            }
            else {
                for (int i = 0; i < birthmonth.length(); i++) {
                    if (!Character.isDigit(birthmonth.charAt(i))) {
                        System.out.println("Please enter a valid month");
                        break;
                    }
                    if (i == birthmonth.length()-1) isvalid = true;
                }
                if (isvalid) {
                    int y = 0;
                    for (int i = 0; i < birthmonth.length(); i++) {
                        y = y*10 + birthmonth.charAt(i)-'0';
                    }
                    if (y > 12 || y < 0){
                        System.out.println("Please enter a valid month");
                    }
                    else {
                        user.setBirthmonth(y);
                        trigger = false;
                    }
                }
            }
        }
    }

    public static void day(User user){

        boolean trigger = true;
        while(trigger){
            boolean isvalid = false;
            System.out.println("Please enter your birthday : ");
            Scanner scan = new Scanner(System.in);
            String birthday = scan.nextLine();
            if (birthday.length() == 0) {
                System.out.println("Please enter a valid day");
            }
            else {
                for (int i = 0; i < birthday.length(); i++) {
                    if (!Character.isDigit(birthday.charAt(i))) {
                        System.out.println("Please enter a valid day");
                        break;
                    }
                    if (i == birthday.length()-1) isvalid = true;
                }
                if (isvalid) {
                    int y = 0;
                    for (int i = 0; i < birthday.length(); i++) {
                        y = y*10 + birthday.charAt(i)-'0';
                    }
                    if (y > 31 || y < 0){
                        System.out.println("Please enter a valid day");
                    }
                    else {

                        user.setBirthyear(y);
                        trigger = false;
                    }
                }
            }
        }
    }


}
