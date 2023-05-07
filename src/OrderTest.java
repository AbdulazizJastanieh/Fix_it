import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class OrderTest {

    private Order order;
    private Customer customer;
    private Worker worker;
    private Service service;

    @BeforeEach
    public void setUp() {
        ArrayList<ArrayList> allA= DataBase._init_(); //load all the info from the database and put it in allA
        Main.CustomerArray = allA.get(0); //store the customer objects (work with this)
        Main.WorkerArray = allA.get(1); //store the worker objects (work with this)
        Main.ServiceArray = allA.get(2); //store the service objects (work with this)s
        Main.OrderArray = allA.get(3); //store the order objects (work with this)
        //END OF _init_ ****************************************************************************************************************************

        customer = Main.CustomerArray.get(1);
        worker = Main.WorkerArray.get(1);
        service =Main.ServiceArray.get(1);
        order = Main.OrderArray.get(1);
    }


    @Test
    public void testSetOID() {
        order.setOID("O002");
        Assertions.assertEquals("O002", order.getOID());
    }

    @Test
    public void testGetCustomer() {
        Assertions.assertEquals(customer, order.getCustomer());
    }

    @Test
    public void testSetCustomer() {
        Customer newCustomer = Main.CustomerArray.get(1);
        order.setCustomer(newCustomer);
        Assertions.assertEquals(newCustomer, order.getCustomer());
    }

    @Test
    public void testGetService() {
        Assertions.assertEquals(service, order.getService());
    }

    @Test
    public void testSetService() {
        Service newService = Main.ServiceArray.get(1);
        order.setService(newService);
        Assertions.assertEquals(newService, order.getService());
    }

    @Test
    public void testGetTotal() {
        Assertions.assertEquals(Main.OrderArray.get(1).getTotal(), order.getTotal());
    }

    @Test
    public void testSetTotal() {
        order.setTotal(75);
        Assertions.assertEquals(75, order.getTotal());
    }

    @Test
    public void testGetWorker() {
        Assertions.assertEquals(worker, order.getWorker());
    }

    @Test
    public void testSetWorker() {
        Worker newWorker = Main.WorkerArray.get(1);
        order.setWorker(newWorker);
        Assertions.assertEquals(newWorker, order.getWorker());
    }

    @Test
    public void testSetOrder_Date() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = dateFormat.parse("2023-05-01");
        order.setOrder_Date(newDate);
        Assertions.assertEquals(newDate, order.getOrder_Date());
    }

}