import java.sql.*;
import java.util.*;
public class DataBase{


    public static Connection connect() {
        String url = "jdbc:mysql://sql8.freemysqlhosting.net"; //this is the URL with add-on of the dataBase the below is the base URL
        //String url = "sql8.freemysqlhosting.net"; //base URL
        String username = "sql8614265"; //USERNAME and the name of the dataBASE
        String password = "EMxp1rkYMb"; //PASS of the database
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //things related to the JAR file
            Connection conn = DriverManager.getConnection(url, username, password); //making the connection
            Statement s = conn.createStatement(); //create statement
            s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)
            ResultSet RS= s.executeQuery("select * from customer");
            while (RS.next()){
                String name = RS.getString(1);
                System.out.println(name);
            }
            return conn;
        } catch(Exception e){ System.out.println(e);
        } finally {
            return null;
        }

    }

    public static ArrayList<ArrayList> init() {
        String url = "jdbc:mysql://sql8.freemysqlhosting.net"; //this is the URL with add-on of the dataBase the below is the base URL
        //String url = "sql8.freemysqlhosting.net"; //base URL
        String username = "sql8614265"; //USERNAME and the name of the dataBASE
        String password = "EMxp1rkYMb"; //PASS of the database
        ArrayList<Customer> cou = new ArrayList<Customer>();
        ArrayList<ArrayList> allObj = new ArrayList<ArrayList>();
        allObj.add(cou);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //things related to the JAR file
            Connection conn = DriverManager.getConnection(url, username, password); //making the connection
            Statement s = conn.createStatement(); //create statement
            s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)
            ResultSet RS= s.executeQuery("select * from customer");
            while (RS.next()){
                String name = RS.getString(1);

            }
            return null;

        } catch(Exception e){ System.out.println(e);
        } finally {
            return null;
        }

    }

}
        

    
