import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
import java.util.*;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DataBaseTest {
    @Test
    public void testConnect() {
        Connection conn = DataBase.connect();
        assertNotNull(conn);
    }

    @Test
    public void test_init_() {
        ArrayList<ArrayList> allObj = DataBase._init_();
        assertNotNull(allObj);
        assertEquals(4, allObj.size());
        assertNotNull(allObj.get(0));
        assertNotNull(allObj.get(1));
        assertNotNull(allObj.get(2));
        assertNotNull(allObj.get(3));
    }

    @Test
    public void testCustomerList() {
        ArrayList<ArrayList> allObj = DataBase._init_();
        ArrayList<Customer> customerList = allObj.get(0);
        assertNotNull(customerList);
        assertEquals(true,customerList.size() > 0);
    }

    @Test
    public void testOrderList() {
        ArrayList<ArrayList> allObj = DataBase._init_();
        ArrayList<Order> orderList = allObj.get(3);
        assertNotNull(orderList);
        assertEquals(true,orderList.size() > 0);
    }

    @Test
    public void testAddCustomer() {
        ArrayList<ArrayList> allObj = DataBase._init_();
        ArrayList<Customer> customerList = allObj.get(0);
        int initialSize = customerList.size();
        Customer customer = new Customer("123", "John", "Doe", new Date(), 100.0, 30, "123456789", "New York", "johndoe", "password");
        customerList.add(customer);
        assertEquals(true,customerList.size() == initialSize + 1);
    }

    @Test
    public void testAddOrder() {
        ArrayList<ArrayList> allObj = DataBase._init_();
        ArrayList<Order> orderList = allObj.get(3);
        int initialSize = orderList.size();
        Customer customer = new Customer("123", "John", "Doe", new Date(), 100.0, 30, "123456789", "New York", "johndoe", "password");
        Worker worker = new Worker("456", "Jane", "Smith", "Plumber", 50.0, "987654321", "janesmith", "password", "New York");
        Service service = new Service("789", "Plumbing", 75.0);
        Order order = new Order("ABC", customer, worker, service, 125.0, new Date());
        orderList.add(order);
        assertEquals(true,orderList.size() == initialSize + 1);
    }
}