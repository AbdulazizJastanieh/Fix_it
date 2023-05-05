import java.sql.*;
import java.util.*;
public class Main {
    public static ArrayList<Customer> CustomerArray = new ArrayList<Customer>(); //make arraylist of customer
    public static ArrayList<Worker> WorkerArray = new ArrayList<Worker>(); //make arraylist of worker
    public static ArrayList<Order> OrderArray = new ArrayList<Order>(); //make arraylist of order
    public static ArrayList<Service> ServiceArray = new ArrayList<Service>(); //make arraylist of service
    public static void main(String[] args)   {

        //Start of _init_ ****************************************************************************************************************************
        ArrayList<ArrayList> allA= DataBase._init_(); //load all the info from the database and put it in allA
        CustomerArray = allA.get(0); //store the customer objects (work with this)
        WorkerArray = allA.get(1); //store the worker objects (work with this)
        ServiceArray = allA.get(2); //store the service objects (work with this)
        OrderArray = allA.get(3); //store the order objects (work with this)
        //END OF _init_ ****************************************************************************************************************************

        //--------------
        //Gui

        new Home(CustomerArray.get(2));
        //--------------
    }
}
