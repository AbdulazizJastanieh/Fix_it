
import java.util.ArrayList;
import java.util.Date;
//v1
public class Person {
    private String First_name;
    private String last_name;
    private String Username;
    private String Password;
    private String Phone_Number;

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


    public String getPhone_Number() {
        return Phone_Number;
    }

    public Person(String first_name, String last_name, String Phone_Number, String username, String password) {
        First_name = first_name;
        this.last_name = last_name;
        this.Phone_Number = Phone_Number;
        Username = username;
        Password = password;

    }

    public Person(){
        
    }
    
}
