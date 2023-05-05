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

    public static void RegisterWorker(String First_name, String last_name, String speciality, String Phone_Number,  String Username, String Password) throws SQLException {
        /* this method will do the following :
            1- create a new worker object.
            2- store that object into the arraylist of workers.
            3- create a new record in the database that represent the new object.
         */
        //the object's balance will be a fixed amount for now.

        //the WID needs to be in order. so we have to obtain the last WID from the arraylist and add one to it.

        Worker lastWorker = Main.WorkerArray.get(Main.WorkerArray.size() - 1 );

        //now we have a reference to the last worker. now we just need to figure his WID and add one to it.

        String LworkerID = lastWorker.getWID();
        //worker id of the last worker.

        String LworkerNum = LworkerID.substring(1);
        //the last worker number.

        int Lworkernum = Integer.parseInt(LworkerNum);

        int Nworkernum = Lworkernum + 1;
        //the new worker number is the last worker number + 1

        String NworkerID;

        if (Nworkernum < 10) {
            NworkerID = "W000" + Nworkernum;
        }
        else if (Nworkernum < 99) {
            NworkerID = "W00" + Nworkernum;
        }
            else if (Nworkernum < 999)
            {
                NworkerID = "W0" + Nworkernum;
            }
            else {
            NworkerID = "W" + Nworkernum;
        }
            //here we are done making the New worker id for the worker.


        Worker NewWorker = new Worker(NworkerID,First_name,last_name,speciality,0,Phone_Number,Username,Password);

        //here we create the object.

        Main.WorkerArray.add(NewWorker);

        //here we add the new worker object to the worker arraylist.

        Connection conn=  DataBase.connect();
        //here we make the connection with the database website.

        Statement s = conn.createStatement(); //create statement
        s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)

        //now we are connected to our database. now we can execute queries.

        String query = "INSERT INTO Worker VALUES (";
        query += "'" + NworkerID + "'" + ",";
        query += "'" + First_name + "'" + ",";
        query += "'" + last_name + "'" + ",";
        query += "'" + speciality + "'" + ",";
        query +=  0  + ",";
        query += "'" + Phone_Number + "'" + ",";
        query += "'" + Username + "'" + ",";
        query += "'" + Password + "'" + ")";

        s.execute(query);

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


    public static void AddService(Worker worker, String SID) throws SQLException {
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

        Connection conn = DataBase.connect();
        Statement s = conn.createStatement(); //create statement
        s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)

        String query = "";
        query +=  "insert into servicelist (SID, WID) values ";
        query += "(" + "'" + SID + "'" + ", " + "'" + worker.getWID() + "'" + ")";


        s.execute(query);

        //here we added the service to the servicelist table.

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

    public static ArrayList<Worker> WorkersBySID(String SID){
        //this method will return an arraylist that contains  all the workers who offer a certain service.

        ArrayList<Worker> workers = new ArrayList<Worker>();

        for (Worker worker : Main.WorkerArray){
            //this for loop will iterate over every worker.

            for (Service service : worker.getServices()){
                //this loop will iterate over every service that the current worker provides.

                if (service.getSID().equals(SID)){
                    workers.add(worker);
                }

            }
        }
        //after finishing both for loops we have done the following:
        //we iterated over every worker. then we iterated over every service that worker provides.
        //and we checked every service that the worker provides. and if we find a service with the same SID
        //as the service we want. then that means that worker provides a service that we want.
        //and so we add that worker to the new arraylist "workers".


        return workers;

    }



}
