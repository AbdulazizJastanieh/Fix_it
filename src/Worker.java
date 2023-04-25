import java.util.Date;

public class Worker extends Person{
    private String WID;
    private String Working_area;
    private double Balance;
    private Service services[];

    public String getWID() {
        return WID;
    }

    public void setWID(String WID) {
        this.WID = WID;
    }

    public String getWorking_area() {
        return Working_area;
    }

    public void setWorking_area(String Working_area) {
        this.Working_area = Working_area;
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

    public Worker(String WID, String Working_area, double Balance, Service[] services, String First_name, String last_name, int age, Date Date_of_Birth, String Username, String Password, Order[] orders) {
        super(First_name, last_name, age, Date_of_Birth, Username, Password, orders);
        this.WID = WID;
        this.Working_area = Working_area;
        this.Balance = Balance;
        this.services = services;
    }

    public Worker(String WID, String Working_area, double Balance, Service[] services) {
        this.WID = WID;
        this.Working_area = Working_area;
        this.Balance = Balance;
        this.services = services;
    }


    public Worker(){
        super();
    }

}
