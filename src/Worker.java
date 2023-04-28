//TODO: ADD delete service - ADD getter for orders(also for customer)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Worker extends Person{
    private String WID;
    private double Balance;
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



    public Worker(String WID , double Balance , String First_name, String last_name,  String Username, String Password) {
        super(First_name, last_name,  Username, Password);
        this.WID = WID;
        this.Balance = Balance;
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

}
