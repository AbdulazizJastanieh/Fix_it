
import java.util.Date;

public class Person {
    private String First_name;
    private String last_name;
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

    public Person(String First_name, String last_name,String Username, String Password, Order[] orders) {
        this.First_name = First_name;
        this.last_name = last_name;
        this.Username = Username;
        this.Password = Password;
        this.orders = orders;
    }

    
    public Person(){
        
    }
    
}
