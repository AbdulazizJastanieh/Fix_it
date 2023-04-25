
import java.util.Date;

public class Person {
    private String First_name;
    private String last_name;
    private int age;
    private Date Date_of_Birth;
    private String Username;
    private String Password;
    private Order[] orders;

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(Date Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Person(String First_name, String last_name, int age, Date Date_of_Birth, String Username, String Password, Order[] orders) {
        this.First_name = First_name;
        this.last_name = last_name;
        this.age = age;
        this.Date_of_Birth = Date_of_Birth;
        this.Username = Username;
        this.Password = Password;
        this.orders = orders;
    }

    
    public Person(){
        
    }
    
}
