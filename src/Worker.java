//TODO: ADD delete service - ADD getter for orders(also for customer)
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Worker extends Person{
    private String WID;
    private double Balance;
    private String speciality;
    private ArrayList<Service> services = new ArrayList<Service>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public String getWID() {
        return WID;
    }

    public void setWID(String WID) {
        this.WID = WID;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(Service services) {
        this.services.add(services);
    }



    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }



    public Worker(String WID , String First_name, String last_name, String speciality, double Balance ,  String Phone_Number,  String Username, String Password) {
        super(First_name, last_name,Phone_Number,  Username, Password);
        this.WID = WID;
        this.Balance = Balance;
        this.speciality = speciality;
    }


    public void setOrders(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "WID='" + WID + '\'' +
                ", Balance=" + Balance +
                ", services=" + services.toString() +
                '}';
    }

    public Worker(){
        super();
    }

    public static void RegisterWorker(String WID , String First_name, String last_name, String speciality, double Balance ,  String Phone_Number,  String Username, String Password) throws SQLException {
        /* this method will do the following :
            1- create a new worker object.
            2- store that object into the arraylist of workers.
            3- create a new record in the database that represent the new object.
         */


        Worker NewWorker = new Worker(WID,First_name,last_name,speciality,Balance,Phone_Number,Username,Password);

        //here we create the object.

        Main.WorkerArray.add(NewWorker);

        //here we add the new worker object to the worker arraylist.

        Connection conn=  DataBase.connect();
        //here we make the connection with the database website.

        Statement s = conn.createStatement(); //create statement
        s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)

        //now we are connected to our database. now we can execute queries.

        String query = "INSERT INTO Worker VALUES (";
        query += "'" + WID + "'" + ",";
        query += "'" + First_name + "'" + ",";
        query += "'" + last_name + "'" + ",";
        query += "'" + speciality + "'" + ",";
        query +=  Balance  + ",";
        query += "'" + Phone_Number + "'" + ",";
        query += "'" + Username + "'" + ",";
        query += "'" + Password + "'" + ")";

        s.executeQuery(query);

        //here we execute the query that we were assembling. this should add the object as a record to the database.

    }

    public static Worker LoginWorker(String Username, String Password){
        //this method will be used by the worker to log in.
        //this method will also return a reference to the Worker that is currently logged in.

        for (Worker worker : Main.WorkerArray){
            //this loop will be used to iterate over every worker object in the arraylist. and in each iteration the
            //"worker" reference variable will reference the current worker object in the arraylist.

            if (worker.getUsername().equals(Username) && worker.getPassword().equals(Password)){
                //if we enter here this means that the object we are currently looking at is the object that the user wants to log in from.
                    return worker;
            }
        }

        return null;
        //if we reach this point. that means we finished iterating over the arraylist. and we didn't find an object
        //with the same username and password.



    }


    public static void AddService(Worker worker, String SID){
        //this method will add a service to the arraylist of services in the worker object.

        Service service = null;
        //temporary variable
        for (Service currentservice : Main.ServiceArray){
            //this loop will iterate over every object in the service array.

            if (currentservice.getSID().equals(SID)){
                service = currentservice;
                //if we find a service object with the same service id. then we make the temporary variable
                //reference the object.
            }
        }

        worker.services.add(service);
        //and here we add the service to the worker service arraylist.
    }


    public static void RemoveService(Worker worker, String SID){
        for (Service currentservice : worker.services){
            //this loop will iterate over every object in the service array.

            if (currentservice.getSID().equals(SID)){
                worker.services.remove(currentservice);
                //if we find a service object with the same service id. then we remove it.
            }

        }

    }



}
