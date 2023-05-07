import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class WorkerTest {

    @Test
    public void testRegisterWorker() {
        ArrayList<ArrayList> allA= DataBase._init_(); //load all the info from the database and put it in allA
        Main.CustomerArray = allA.get(0); //store the customer objects (work with this)
        Main.WorkerArray = allA.get(1); //store the worker objects (work with this)
        Main.ServiceArray = allA.get(2); //store the service objects (work with this)s
        Main.OrderArray = allA.get(3); //store the order objects (work with this)
        //END OF _init_ ****************************************************************************************************************************


        // test the RegisterWorker method
        Worker worker = Worker.RegisterWorker("John", "Doe", "Plumber", "123456789", "johndoe", "password", "New York");
        assertNotNull(worker);
        assertEquals("John", worker.getFirst_name());
        assertEquals("Doe", worker.getLast_name());
        assertEquals("Plumber", worker.getSpeciality());
        assertEquals("123456789", worker.getPhone());
        assertEquals("johndoe", worker.getUsername());
        assertEquals("password", worker.getPassword());
        assertEquals("New York", worker.getWorking_Area());
    }

    @Test
    public void testLoginWorker() {
        // test the LoginWorker method
        Worker worker = Worker.LoginWorker("johndoe", "password");
        assertNotNull(worker);
        assertEquals("John", worker.getFirst_name());
        assertEquals("Doe", worker.getLast_name());
        assertEquals("Plumber", worker.getSpeciality());
        assertEquals("123456789", worker.getPhone());
        assertEquals("johndoe", worker.getUsername());
        assertEquals("password", worker.getPassword());
        assertEquals("New York", worker.getWorking_Area());
    }

    @Test
    public void testAddService() throws SQLException {
        // test the AddService method
        Worker worker = Worker.RegisterWorker("John", "Doe", "Plumber", "123456789", "johndoe", "password", "New York");
        Service service = new Service("S0001", "Plumbing",  50.0);
        Worker.AddService(worker, "S0001");
        ArrayList<Service> services = worker.getServices();
        assertNotNull(services);
        assertEquals(1, services.size());
    }

    @Test
    public void testManageService() throws SQLException {
        // test the ManageService method
        Worker worker = Worker.RegisterWorker("John", "Doe", "Plumber", "123456789", "johndoe", "password", "New York");
        Service service = new Service("S0001", "Plumbing", 50.0);
        Worker.AddService(worker, "S0001");
        ArrayList<Service> services = worker.getServices();
        assertNotNull(services);
        assertEquals(1, services.size());
        Worker.ManageService(worker, "S0001");
        services = worker.getServices();
        assertNotNull(services);
        assertEquals(0, services.size());
    }

    @Test
    public void testWorkersBySID() throws SQLException {
        // test the WorkersBySID method
        Worker worker1 = Worker.RegisterWorker("John", "Doe", "Plumber", "123456789", "johndoe", "password", "New York");
        Worker worker2 = Worker.RegisterWorker("Jane", "Doe", "Electrician", "987654321", "janedoe", "password", "Boston");
        Service service1 = new Service("S0001", "Plumbing", 50.0);
        Service service2 = new Service("S0002", "Electrical",  75.0);
        Worker.AddService(worker1, "S0001");
        Worker.AddService(worker2, "S0002");
        ArrayList<Worker> workers = Worker.WorkersBySID("S0001");
        assertNotNull(workers);
    }
}