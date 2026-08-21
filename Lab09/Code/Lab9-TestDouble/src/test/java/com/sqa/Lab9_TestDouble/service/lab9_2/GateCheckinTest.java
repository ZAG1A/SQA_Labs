package com.sqa.Lab9_TestDouble.service.lab9_2;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GateCheckinTest {

    @Mock
    private TicketCounter ticketCounter;

    @InjectMocks
    private GateCheckin gateCheckin;

    @Test
    void testCustomerEntry_ValidTicket_ShouldUpdateTicketCounter() {
        int ticketId = 1001;

        gateCheckin.customerEntry(ticketId);

        Set<Integer> passengers = gateCheckin.getPassengersOnBoard();
        assertTrue(passengers.contains(ticketId));
        assertEquals(1, passengers.size());
        verify(ticketCounter, times(1)).changeTicketStatus(true);
    }

    @Test
    void testCustomerEntry_DuplicateTicket_ShouldNotCallCounterTwice() {
        int ticketId = 1001;

        gateCheckin.customerEntry(ticketId);
        gateCheckin.customerEntry(ticketId);

        Set<Integer> passengers = gateCheckin.getPassengersOnBoard();
        assertEquals(1, passengers.size());
        verify(ticketCounter, times(1)).changeTicketStatus(true);
    }
}