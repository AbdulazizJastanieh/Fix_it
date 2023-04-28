//TODO add number (as string)
import java.util.*;


public class Customer extends Person {
    private String CID;
    private String Location;
    private double Balance;
    private Date Date_of_Birth;
    private int age;
    private ArrayList<Order> orders = new ArrayList<Order>();

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



    public Customer(String CID, String Location, double Balance, String First_name, String last_name, int age, Date Date_of_Birth, String Username, String Password) {
        super(First_name, last_name,  Username, Password);
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
}
