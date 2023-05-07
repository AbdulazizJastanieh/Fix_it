import java.sql.*;
import java.util.*;
import java.util.Date;
//v1
public class DataBase{


    public static Connection connect() { //this method is used to return the connection of the database (Note: didn't test the return yet)
        String url = "jdbc:mysql://sql8.freemysqlhosting.net"; //this is the URL with add-on of the dataBase the below is the base URL
        //String url = "sql8.freemysqlhosting.net"; //base URL
        String username = "sql8614265"; //USERNAME and the name of the dataBASE
        String password = "EMxp1rkYMb"; //PASS of the database
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //things related to the JAR file
            Connection conn = DriverManager.getConnection(url, username, password); //making the connection
            return conn;
        } catch(Exception e){
            System.out.println(e);
            return null;
        }


    }

    public static ArrayList<ArrayList> _init_() { //this method is used to load all the info from the database to the objects !
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


            //Start of getting info from customer table =======================================
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
                Customer tempCustoemr = new Customer(CID,cfname,clname,cdate,balance,age,cnumber,cloc,cusername,cpassword); //make new arrraylist then store it !
                customerArrayList.add(tempCustoemr);
            }
            RS.close();
            //End of getting info from customer table =======================================


            //Start of getting info from Worker table =======================================
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
                String Working_Area = RS2.getString(9);


                //ok now we need to store all of that info into the worker class as object
                Worker tempWorker = new Worker(WID,wfname,wlname,specialty,balance,wnumber,wusername,wpassword,Working_Area);
                workerArrayList.add(tempWorker);
            }
            RS2.close();
            //END of getting info from Worker table =======================================


            //Start of getting info from Service table =======================================
            ResultSet RS3= s.executeQuery("select * from Service");
            while (RS3.next()){
                String SID = RS3.getString(1);
                String name = RS3.getString(2);
                Double price = RS3.getDouble(3);


                //ok now we need to store all of that info into the service class as object
                Service tempService = new Service(SID,name,price);
                serviceArrayList.add(tempService);
            }
            RS3.close();
            //END of getting info from Service table =======================================




            //Start of getting info from ServiceWorker table =======================================
                ResultSet RS4 = s.executeQuery("select * from WorkerService");
            while (RS4.next()) {
                String SID = RS4.getString(1); //Store SID from database
                String WID = RS4.getString(2); //Store WID from database
                int i = 0; //i is a value for a while loop down
                while (i < workerArrayList.size()) { //this loop checks the worker array
                    if (workerArrayList.get(i).getWID().equals(WID)) { //then compare it with WID of current set
                        int j = 0; //if found go into a second loop to get the service object (because I just can't put the SID in worker class I need the whole object)
                        while (j < serviceArrayList.size()) {
                            if (serviceArrayList.get(j).getSID().equals(SID)) { //if I found the object
                                workerArrayList.get(i).setServices(serviceArrayList.get(j)); //link it with the worker object
                            }
                            j++; //repeat until all services of the worker are added
                        }
                    }
                    i++; //go to the next worker
                }
            }
            RS4.close();
            //END of getting info from ServiceWorker table =======================================

            //Start of getting info from Orders table =======================================
            ResultSet RS5= s.executeQuery("select * from Orders");
            while (RS5.next()) {
                String OID = RS5.getString(1); //get OID from database
                Date date = RS5.getDate(2); //get date from database
                double total = RS5.getDouble(3); //get total from database
                String SID = RS5.getString(4); //get SID from database
                String WID = RS5.getString(5); //get WID from database
                String CID = RS5.getString(6); //get CID from database

                  int i=0; //counter for loop to mark the customer class
                int j =-1; //to store the customer class number
                while (i<customerArrayList.size()) {
                    if (customerArrayList.get(i).getCID().equals(CID)) { //if found
                        j = i; //if found then store the number of object in j
                    }
                    i++;
                }

                i=0;
                int k =-1; //to store the worker class number
                while (i<workerArrayList.size()) {
                    if (workerArrayList.get(i).getWID().equals(WID)) { //if found
                        k = i; //if found then store the number of object in k
                    }
                    i++;
                }
                i=0;
                int p =-1; //to store the Service class number
                while (i<serviceArrayList.size()) {
                    if (serviceArrayList.get(i).getSID().equals(SID)) { //if found
                        p = i; //if found then store the number of object in p
                    }
                    i++;
                }
                Customer customer  = customerArrayList.get(j); //temp object to hold customer
                Worker worker =  workerArrayList.get(k); //temp object to hold worker
                Service service = serviceArrayList.get(p); //temp object to hold service
                Order order = new Order(OID,customer,worker,service,total,date); //now I need to store all that info into order class
               orderArrayList.add(order); //add it to the arraylist

                //after that we need to link it with the worker and the customer classes
                worker.setOrders(order); //set it for worker
                customer.setOrders(order); //set it for customer
            }
               RS5.close();
            //END of getting info from Orders table =======================================
            s.close(); //close the statement
            conn.close(); //close the connection
            allObj.add(customerArrayList); //add the customer arraylist to the father arraylist
            allObj.add(workerArrayList); //add the worker arraylist to the father arraylist
            allObj.add(serviceArrayList); //add the service arraylist to the father arraylist
            allObj.add(orderArrayList); //add the order arraylist to the father arraylist
        } catch(Exception e){ System.out.println(e);
        } finally {
            return allObj;
        }

    }


}