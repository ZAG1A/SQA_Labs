package com.sqa.Lab9_TestDouble.service.lab9_2;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GateCheckin {
    
    private Set<Integer> checkinCustomer;
    
    private TicketCounter ticketCounter;
    
    /*
     * Constructor
     */
    public GateCheckin(TicketCounter ticketCounter) {
        this.checkinCustomer = new HashSet<Integer>();
        this.ticketCounter = ticketCounter;
    }
    
    /*
     * A customer can enter a theater when their ticket is checked.
     */
    public void customerEntry(int ticketId){
        if(customerIsEligible(ticketId)) {
            checkinCustomer.add(ticketId);
            ticketCounter.changeTicketStatus(true);
        }
    }

    public Set<Integer> getPassengersOnBoard() {
        return checkinCustomer;
    }

    public boolean customerIsEligible(int ticketId) {
        return !checkinCustomer.contains(ticketId);
    }

}