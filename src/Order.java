
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private String OID;
    private Customer customer;
    private Worker worker;
    private Service service;
    private double Total;
    private Date Order_Date;

    public String getOID() {
        return OID;
    }

    public void setOID(String OID) {
        this.OID = OID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public double getTotal() {
        return Total;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Order(String OID) {
        this.OID = OID;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Date getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(Date Order_Date) {
        this.Order_Date = Order_Date;
    }

    public Order(String OID, Customer customer, Worker worker, Service service, double total, Date order_Date) {
        this.OID = OID;
        this.customer = customer;
        this.worker = worker;
        this.service = service;
        Total = total;
        Order_Date = order_Date;
    }

    public Order(){
        
    }

    public static void NewOrder(Customer customer,String SID,String WID) throws SQLException {
        //1-this method should make a new order. save to the arraylists (customer,worker,main orders ).
        //2-make a new order in the database.
        //3-deduct the balance from the customer. and add the balance to the worker.
        //4-and make the appropriate changes to the database.


        //in order to make a new order we have to know the worker. and service.

        Worker worker= null;
        Service service = null;

        for (Worker workertemp: Main.WorkerArray){
            //here we iterate over every worker.
            if (workertemp.getWID().equals(WID)) {
                //if we enter here that means we have found the worker that is related to the WID.

                worker = workertemp;
            }
        }

        for (Service servicetemp: Main.ServiceArray){
            //here we iterate over every service.
            if (servicetemp.getSID().equals(SID)) {
                //if we enter here that means we have found the service that is related to the SID.

                service = servicetemp;
            }
        }

        //after reaching this point we should have found the related service and worker.
        //now we need to figure the OID.

        Order lastOrder = Main.OrderArray.get(Main.OrderArray.size() - 1 );

        //now we have a reference to the last order. now we just need to figure his OID and add one to it.

        String LOrderID = lastOrder.getOID();
        //order id of the last order.

        String LOrderNum = LOrderID.substring(1);
        //the last order number.

        int Lordernum = Integer.parseInt(LOrderNum);

        int Nordernum = Lordernum + 1;
        //the new customer number is the last worker number + 1

        String NorderID;

        if (Nordernum < 10) {
            NorderID = "O000" + Nordernum;
        }
        else if (Nordernum < 99) {
            NorderID = "O00" + Nordernum;
        }
        else if (Nordernum < 999)
        {
            NorderID = "O0" + Nordernum;
        }
        else {
            NorderID = "O" + Nordernum;
        }
        //here we are done making the New order id for the order.

        double price = service.getPrice();
        Date currentdate = new Date();
        //preparing the datafields of the new order.


        Order order = new Order(NorderID,customer,worker,service,price,currentdate);
        //here we are done making the order. now we have to save it to the arraylists.

        Main.OrderArray.add(order);
        customer.setOrders(order);
        worker.setOrders(order);

        //here we saved the order to the arraylists.
        //step 1 finished now we save to the database.

        Connection conn=  DataBase.connect();
        //here we make the connection with the database website.

        Statement s = conn.createStatement(); //create statement
        s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(order.Order_Date);
        //here I make a String that represent the order date.

        //now we are connected to our database. now we can execute queries.

        String query = "INSERT INTO Orders VALUES (";
        query += "'" + order.OID + "'" + ",";
        query += "'" + formattedDate + "'" + ",";
        query += order.getTotal() + ",";
        query += "'" + order.getService().getSID() + "'" + ",";
        query += "'" + order.getWorker().getWID() + "'" + ",";
        query += "'" + order.getCustomer().getCID() + "'" + ")";

        s.execute(query);

        //here we execute the query that we were assembling. this should add the object as a record to the database.

        //here we are done with the second step. now we need to deduct the balance from the customer and add to the worker.

        double Cnewbalance = customer.getBalance() - order.getTotal();
        customer.setBalance(Cnewbalance);

        double Wnewbalance = worker.getBalance() + order.getTotal();
        worker.setBalance(Wnewbalance);

        //here we updated the balances of the customer and the worker.
        //now we need to update the worker record and the customer record.

        String query2 = "update customer set balance = "+ customer.getBalance() + "where CID = "+ customer.getCID();
        String query3 = "update worker set balance = "+ worker.getBalance() + "where WID = "+ worker.getWID();

        s.execute(query2);
        s.execute(query3);

        //here we are done making the changes to the database.











    }



    
}
