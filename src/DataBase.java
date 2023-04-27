import java.sql.*;
import java.util.*;
import java.util.Date;

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
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>(); //make arraylist of customer
        ArrayList<Order> orderArrayList = new ArrayList<Order>(); //make arraylist of order
        ArrayList<Service> serviceArrayList = new ArrayList<Service>(); //make arraylist of service
        ArrayList<Worker> workerArrayList = new ArrayList<Worker>(); //make arraylist of service
        ArrayList<ArrayList> allObj = new ArrayList<ArrayList>(); //make a father arraylist (to store all the arraylists)



        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //things related to the JAR file
            Connection conn = DriverManager.getConnection(url, username, password); //making the connection
            Statement s = conn.createStatement(); //create statement
            s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)
            ResultSet RS= s.executeQuery("select * from Customer");
            //ResultSet RS2= s.executeQuery("select * from Orders");

            while (RS.next()){ //while (database table has lines)
                String CID = RS.getString(1);
                String cfname = RS.getString(2);
                String clname = RS.getString(3);
                Date cdate = RS.getDate(4);
                double balance = RS.getDouble(5);
                int age = RS.getInt(6);
                String cnumber = RS.getString(7);
                String cloc = RS.getString(8);
                String cusername = RS.getString(9);
                String cpassword = RS.getString(10);
                Customer tempCustoemr = new Customer(CID,cloc,balance,cfname,clname,age,cdate,cusername,cpassword); //make new arrraylist then store it !
                customerArrayList.add(tempCustoemr);
            }
            RS.close();
            ResultSet RS2= s.executeQuery("select * from Worker");
            while (RS2.next()) { //while (database table has lines)
                String WID = RS2.getString(1);
                String wfname = RS2.getString(2);
                String wlname = RS2.getString(3);
                String specialty = RS2.getString(4);
                double balance = RS2.getDouble(5);
                String wnumber = RS2.getString(6);
                String wusername = RS2.getString(7);
                String wpassword = RS2.getString(8);
                String CID = RS2.getString(9);

                Customer WorkerCustomer = null; //default value for Customer object if not found
                int i=0; //counter for loop to mark the customer class
                int j =-1; //to store the customer class number
                while (i<customerArrayList.size()) {
                    if (customerArrayList.get(i).getCID().equals(CID)) { //if found
                        j = i; //if found store it's number in j
                    }
                    i++;
                }
                    if (j != -1){ //check if found or not then store it's object if found
                        WorkerCustomer = customerArrayList.get(j);
                        System.out.println("worked !");
                    }

            //ok now we need to store all of that info into the worker class as object
                Worker tempWorker = new Worker(WID,balance,wfname,wlname,wusername,wpassword,WorkerCustomer);
                workerArrayList.add(tempWorker);
            }
            allObj.add(customerArrayList);
            allObj.add(workerArrayList);
            allObj.add(orderArrayList);
            allObj.add(serviceArrayList);
        } catch(Exception e){ System.out.println(e);
        } finally {
            System.out.println("test");
            return allObj;
        }

    }

}