
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
    
}
