import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CustomerTest.RegisterCustomerTest.class,
        CustomerTest.LoginCustomerTest.class,
        CustomerTest.GettersAndSettersTest.class
})
public class CustomerTest {

    public static class RegisterCustomerTest {

        @Test
        public void testRegisterCustomer() throws ParseException {
            ArrayList<ArrayList> allA= DataBase._init_(); //load all the info from the database and put it in allA
            Main.CustomerArray = allA.get(0); //store the customer objects (work with this)
            Main.WorkerArray = allA.get(1); //store the worker objects (work with this)
            Main.ServiceArray = allA.get(2); //store the service objects (work with this)s
            Main.OrderArray = allA.get(3); //store the order objects (work with this)
            //END OF _init_ ****************************************************************************************************************************

            // Initialize test data
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String location = "New York";
            String username = "johndoe";
            String password = "password";
            String dateString = "1990-01-01";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOfBirth = dateFormat.parse(dateString);
            int age = 31;

            // Call the method being tested
            Customer customer = Customer.RegisterCustomer(firstName, lastName, dateOfBirth, age, phoneNumber,
                    location, username, password);

            // Verify the results
            assertNotNull(customer);
            assertEquals(firstName, customer.getFirst_name());
            assertEquals(lastName, customer.getLast_name());
            assertEquals(phoneNumber, customer.getPhone_Number());
            assertEquals(location, customer.getLocation());
            assertEquals(username, customer.getUsername());
            assertEquals(password, customer.getPassword());
            assertEquals(dateOfBirth, customer.getDate_of_Birth());
            assertEquals(age, customer.getAge());
            assertEquals(200, customer.getBalance(), 0.01);
            assertNotNull(customer.getCID());
        }
    }

    public static class LoginCustomerTest {

        @Test
        public void testLoginCustomer() throws ParseException {
            // Initialize test data
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String location = "New York";
            String username = "johndoe";
            String password = "password";
            String dateString = "1990-01-01";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOfBirth = dateFormat.parse(dateString);
            int age = 31;

            // Add a customer to the array list
            Customer customer = new Customer();
            customer.setFirst_name(firstName);
            customer.setLast_name(lastName);
            customer.setPhone_Number(phoneNumber);
            customer.setLocation(location);
            customer.setUsername(username);
            customer.setPassword(password);
            customer.setDate_of_Birth(dateOfBirth);
            customer.setAge(age);
            customer.setBalance(200);
            customer.setCID("C0001");
            Main.CustomerArray.add(customer);

            // Call the method being tested
            Customer loggedInCustomer = Customer.LoginCustomer(username, password);

            // Verify the results
            assertNotNull(loggedInCustomer);
            assertEquals(firstName, loggedInCustomer.getFirst_name());
            assertEquals(lastName, loggedInCustomer.getLast_name());
            assertEquals(phoneNumber, loggedInCustomer.getPhone_Number());
            assertEquals(location, loggedInCustomer.getLocation());
            assertEquals(username, loggedInCustomer.getUsername());
            assertEquals(password, loggedInCustomer.getPassword());
            assertEquals(dateOfBirth, loggedInCustomer.getDate_of_Birth());
            assertEquals(age, loggedInCustomer.getAge());
            assertEquals(200, loggedInCustomer.getBalance(), 0.01);
        }

        @Test
        public void testLoginCustomer_wrongCredentials() throws ParseException {
            // Initialize test data
            String username = "johndoe";
            String password = "password";

            // Add a customer to the array list
            Customer customer = new Customer();
            customer.setUsername(username);
            customer.setPassword(password);
            Main.CustomerArray.add(customer);

            // Call the method being tested
            Customer loggedInCustomer = Customer.LoginCustomer("invalid_username", "invalid_password");

            // Verify the results
            assertNull(loggedInCustomer);
        }
    }

    public static class GettersAndSettersTest {

        @Test
        public void testGettersAndSetters() throws ParseException {
            // Initialize test data
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String location = "New York";
            String username = "johndoe";
            String password = "password";
            String dateString = "1990-01-01";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOfBirth = dateFormat.parse(dateString);
            int age = 31;

            // Create a new customer object
            Customer customer = new Customer();
            customer.setFirst_name(firstName);
            customer.setLast_name(lastName);
            customer.setPhone_Number(phoneNumber);
            customer.setLocation(location);
            customer.setUsername(username);
            customer.setPassword(password);
            customer.setDate_of_Birth(dateOfBirth);
            customer.setAge(age);
            customer.setBalance(200);
            customer.setCID("C0001");

            // Verify the results
            assertEquals(firstName, customer.getFirst_name());
            assertEquals(lastName, customer.getLast_name());
            assertEquals(phoneNumber, customer.getPhone_Number());
            assertEquals(location, customer.getLocation());
            assertEquals(username, customer.getUsername());
            assertEquals(password, customer.getPassword());
            assertEquals(dateOfBirth, customer.getDate_of_Birth());
            assertEquals(age, customer.getAge());
            assertEquals(200, customer.getBalance(), 0.01);
            assertEquals("C0001", customer.getCID());
        }
    }
}