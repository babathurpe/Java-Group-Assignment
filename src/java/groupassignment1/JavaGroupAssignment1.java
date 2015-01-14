/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.groupassignment1;

/**
 *
 * @author macbookpro
 */
public class JavaGroupAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer customer1 = new Customer(1, "Bob");
        
        Purchase purchase1 = new Purchase("P101", 5);
        Order order1 = new Order();
        order1.addPurchase(purchase1);
        order1.setTimeReceived("10:00pm");
        
        
        
    }
    
}
