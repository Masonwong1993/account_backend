import java.sql.*;

public class SQL_dao {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String user = "root";
        String password = "1993";
        //test check
        //String fn = "\'huajun\'";
        //Check(url,user,password,fn);

        //test add
        //String value = "values('limin','zhang','male','29055924@qq.com','1972-10-11')";
        //Create(url,user,password,value);v

        //test update
        //String updateinfo = "email='290516561@qq.com'";
        //String taginfo = "firstname='huajun'";
        //Update(url,user,password,updateinfo,taginfo);

        //test delete
//        String deleteinfo = "firstname='limin'";
//        Delete(url,user,password,deleteinfo);

    }
    //check user information by firstname
    public static void Check(String url, String user, String password, String fn){
        try {
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from users where firstname ="+fn;
            ResultSet myRs = myStmt.executeQuery(sql);
            while (myRs.next()){
                String firstname = myRs.getString("firstname");
                String lastname = myRs.getString("lastname");
                String gender = myRs.getString("gender");
                String email = myRs.getString("email");
                String birthdate = myRs.getString("birthdate");
                System.out.format("%s, %s, %s, %s, %s\n",firstname,lastname,gender,email,birthdate);
            }
            myStmt.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    //add new user information
    public static void Create(String url, String user, String password,String value){
        try{
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = "insert into users(firstname,lastname,gender,email,birthdate)"+
                         value;
            myStmt.executeUpdate(sql);
            myStmt.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Add user successfully");
    }
    //update user information by given information
    public static void Update(String url, String user, String password,String updateinfo, String taginfo){
        try{
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = "update users set "+updateinfo+
                    " where "+taginfo;
            myStmt.executeUpdate(sql);
            myStmt.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Update user information successfully");
    }
    public static void Delete(String url, String user, String password, String deleteinfo){
        try{
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = "delete from users where "+deleteinfo;
            myStmt.executeUpdate(sql);
            myStmt.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Delete user information successfully");
    }
}
