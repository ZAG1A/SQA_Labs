package com.sqa.Lab9_TestDouble.service.lab9_2;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

public class TicketCounter {
    
    private Integer noCheckinCustomer = 0;
    
    public void changeTicketStatus(boolean isValidTicket) {
        
        if (isValidTicket) {
            noCheckinCustomer++;
        }			
    }
    
    public int getNoCheckinCustomer() {
        return noCheckinCustomer;
    }
    
    public void resetNoCheckinCustomer() {
        noCheckinCustomer = 0;
    }

}