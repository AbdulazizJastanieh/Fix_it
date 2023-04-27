import java.sql.*;
import java.util.*;
public class Main {
    

    public static void main(String[] args)   {
    ArrayList<Customer> CustomerArray = new ArrayList<Customer>();
    ArrayList<Worker> WorkerArray = new ArrayList<Worker>();
    ArrayList<ArrayList> allA= DataBase.init();

    //testing (you can delete) =========================================================
    CustomerArray = allA.get(0);
    WorkerArray = allA.get(1);
    int i=0;
    while (i<WorkerArray.size()){
        System.out.println(WorkerArray.get(i).toString());
        i++;
    } //end of testing ==================================================================
        
        
    }
}
