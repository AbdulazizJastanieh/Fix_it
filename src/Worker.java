import java.util.Arrays;
import java.util.Date;

public class Worker extends Person{
    private String WID;
    private double Balance;
    private Customer customer;
    private Service services[];

    public String getWID() {
        return WID;
    }

    public void setWID(String WID) {
        this.WID = WID;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "WID='" + WID + '\'' +
                ", Balance=" + Balance +
                ", customer=" + customer +
                ", services=" + Arrays.toString(services) +
                '}';
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public Worker(String WID , double Balance , String First_name, String last_name,  String Username, String Password,Customer customer) {
        super(First_name, last_name,  Username, Password, null);
        this.WID = WID;
        this.Balance = Balance;
        this.customer =customer;
    }


    public Worker(String WID , double Balance, Service[] services, String First_name, String last_name, String Username, String Password, Order[] orders) {
        super(First_name, last_name,  Username, Password, orders);
        this.WID = WID;
        this.Balance = Balance;
        this.services = services;
    }

    public Worker(){
        super();
    }

}
