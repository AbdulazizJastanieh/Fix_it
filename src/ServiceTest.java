import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ServiceTest {
    private Service service;

    @Before
    public void setUp() {
        service = new Service("S001", "Cleaning", 50.0);
    }

    @Test
    public void testGetSID() {
        assertEquals("S001", service.getSID());
    }

    @Test
    public void testSetSID() {
        service.setSID("S002");
        assertEquals("S002", service.getSID());
    }

    @Test
    public void testGetName() {
        assertEquals("Cleaning", service.getName());
    }

    @Test
    public void testSetName() {
        service.setName("Gardening");
        assertEquals("Gardening", service.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(50.0, service.getPrice(), 0.0);
    }

    @Test
    public void testSetPrice() {
        service.setPrice(60.0);
        assertEquals(60.0, service.getPrice(), 0.0);
    }

    @Test
    public void testConstructor() {
        assertNotNull(service);
        assertEquals("S001", service.getSID());
        assertEquals("Cleaning", service.getName());
        assertEquals(50.0, service.getPrice(), 0.0);
    }
}