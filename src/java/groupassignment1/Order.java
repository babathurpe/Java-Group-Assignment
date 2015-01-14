/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.groupassignment1;

import java.util.List;

/**
 *
 * @author macbookpro
 */
public class Order {
    private String timeReceived;
    private String timeProcessed;
    private String timeFulfilled;
    private List<Purchase> purchaseList;
    private String notes;

    public Order() {
    }

    
    
    public Order(String timeReceived, String timeProcessed, String timeFulfilled, List<Purchase> purchaseList, String notes) {
        this.timeReceived = timeReceived;
        this.timeProcessed = timeProcessed;
        this.timeFulfilled = timeFulfilled;
        this.purchaseList = purchaseList;
        this.notes = notes;
    }

    
    
    public String getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(String timeReceived) {
        this.timeReceived = timeReceived;
    }

    public String getTimeProcessed() {
        return timeProcessed;
    }

    public void setTimeProcessed(String timeProcessed) {
        this.timeProcessed = timeProcessed;
    }

    public String getTimeFulfilled() {
        return timeFulfilled;
    }

    public void setTimeFulfilled(String timeFulfilled) {
        this.timeFulfilled = timeFulfilled;
    }

    public String getNotes() {
        return notes;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
