//TODO add number (as string)
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer extends Person {
    private String CID;
    private String Location;
    private double Balance;
    private Date Date_of_Birth;
    private int age;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Date getDate_of_Birth() {
        return Date_of_Birth;
    }

    public String getCID() {
        return CID;
    }

    public void setOrders(Order order) {
        this.orders.add(order);
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }



    public Customer(String CID, String First_name, String last_name, Date Date_of_Birth, double Balance,  int age,String Phone_Number, String Location, String Username, String Password) {
        super(First_name, last_name,Phone_Number,  Username, Password);
        this.CID = CID;
        this.age =age;
        this.Location = Location;
        this.Balance = Balance;
        this.Date_of_Birth =Date_of_Birth;
    }
    public Customer(String CID, String Location, double Balance) {
        this.CID = CID;
        this.Location = Location;
        this.Balance = Balance;
    }

    public Customer(){
        super();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CID='" + CID + '\'' +
                ", Location='" + Location + '\'' +
                ", Balance=" + Balance +
                '}';
    }

    public static void RegisterCustomer( String First_name, String last_name, Date Date_of_Birth, int age,String Phone_Number, String Location, String Username, String Password) throws SQLException {
        /* this method will do the following :
            1- create a new Customer object.
            2- store that object into the arraylist of Customers.
            3- create a new record in the database that represent the new object.
         */

        Customer lastCustomer = Main.CustomerArray.get(Main.CustomerArray.size() - 1 );

        //now we have a reference to the last customer. now we just need to figure his CID and add one to it.

        String LCustomerID = lastCustomer.getCID();
        //worker id of the last customer.

        String LCustomerNum = LCustomerID.substring(1);
        //the last customer number.

        int Lwcustomernum = Integer.parseInt(LCustomerNum);

        int Ncustomernum = Lwcustomernum + 1;
        //the new customer number is the last worker number + 1

        String NcustomerID;

        if (Ncustomernum < 10) {
            NcustomerID = "C000" + Ncustomernum;
        }
        else if (Ncustomernum < 99) {
            NcustomerID = "C00" + Ncustomernum;
        }
        else if (Ncustomernum < 999)
        {
            NcustomerID = "C0" + Ncustomernum;
        }
        else {
            NcustomerID = "C" + Ncustomernum;
        }
        //here we are done making the New Customer id for the customer.



        Customer NewCustomer = new Customer(NcustomerID,First_name,last_name,Date_of_Birth,200,age,Phone_Number,Location,Username,Password);

        //here we create the object.

        Main.CustomerArray.add(NewCustomer);

        //here we add the new worker object to the worker arraylist.

        Connection conn=  DataBase.connect();
        //here we make the connection with the database website.

        Statement s = conn.createStatement(); //create statement
        s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)

        //now we are connected to our database. now we can execute queries.

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(Date_of_Birth);
        //here I make a String that represent the DateofBirth and then I put it into the query

        String query = "INSERT INTO Customer VALUES (";
        query += "'" + NcustomerID + "'" + ",";
        query += "'" + First_name + "'" + ",";
        query += "'" + last_name + "'" + ",";
        query += "'" + formattedDate + "'" + ",";
        query +=  200  + ",";
        query += "'" + age + "'" + ",";
        query += "'" + Phone_Number + "'" + ",";
        query += "'" + Location + "'" + ",";
        query += "'" + Username + "'" + ",";
        query += "'" + Password + "'" + ")";

        s.executeQuery(query);

        //here we execute the query that we were assembling. this should add the object as a record to the database.

    }

    public static Customer LoginCustomer(String Username, String Password){
        //this method will be used by the customer to log in.
        //this method will also return a reference to the customer that is currently logged in.

        for (Customer customer : Main.CustomerArray){
            //this loop will be used to iterate over every worker object in the arraylist. and in each iteration the
            //"worker" reference variable will reference the current worker object in the arraylist.

            if (customer.getUsername().equals(Username) && customer.getPassword().equals(Password)){
                //if we enter here this means that the object we are currently looking at is the object that the user wants to log in from.
                return customer;
            }
        }

        return null;
        //if we reach this point. that means we finished iterating over the arraylist. and we didn't find an object
        //with the same username and password.



    }
}
