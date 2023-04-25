
import java.util.*;


public class Customer extends Person {
    private String CID;
    private String Location;
    private double Balance;

    public String getCID() {
        return CID;
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

    public Customer(String CID, String Location, double Balance, String First_name, String last_name, int age, Date Date_of_Birth, String Username, String Password, Order[] orders) {
        super(First_name, last_name, age, Date_of_Birth, Username, Password, orders);
        this.CID = CID;
        this.Location = Location;
        this.Balance = Balance;
    }

    public Customer(String CID, String Location, double Balance) {
        this.CID = CID;
        this.Location = Location;
        this.Balance = Balance;
    }

    public Customer(){
        super();
    }    
    
}
