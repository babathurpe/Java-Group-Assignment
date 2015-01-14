/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java.groupassignment1;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0637609
 */
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTimeReceived method, of class Order.
     */
    @Test
    public void testGetTimeReceived() {
        System.out.println("getTimeReceived");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getTimeReceived();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeReceived method, of class Order.
     */
    @Test
    public void testSetTimeReceived() {
        System.out.println("setTimeReceived");
        String timeReceived = "";
        Order instance = new Order();
        instance.setTimeReceived(timeReceived);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeProcessed method, of class Order.
     */
    @Test
    public void testGetTimeProcessed() {
        System.out.println("getTimeProcessed");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getTimeProcessed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeProcessed method, of class Order.
     */
    @Test
    public void testSetTimeProcessed() {
        System.out.println("setTimeProcessed");
        String timeProcessed = "";
        Order instance = new Order();
        instance.setTimeProcessed(timeProcessed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeFulfilled method, of class Order.
     */
    @Test
    public void testGetTimeFulfilled() {
        System.out.println("getTimeFulfilled");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getTimeFulfilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeFulfilled method, of class Order.
     */
    @Test
    public void testSetTimeFulfilled() {
        System.out.println("setTimeFulfilled");
        String timeFulfilled = "";
        Order instance = new Order();
        instance.setTimeFulfilled(timeFulfilled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Order.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPurchaseList method, of class Order.
     */
    @Test
    public void testGetPurchaseList() {
        System.out.println("getPurchaseList");
        Order instance = new Order();
        List<Purchase> expResult = null;
        List<Purchase> result = instance.getPurchaseList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPurchaseList method, of class Order.
     */
    @Test
    public void testSetPurchaseList() {
        System.out.println("setPurchaseList");
        List<Purchase> purchaseList = null;
        Order instance = new Order();
        instance.setPurchaseList(purchaseList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Order.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Order instance = new Order();
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
