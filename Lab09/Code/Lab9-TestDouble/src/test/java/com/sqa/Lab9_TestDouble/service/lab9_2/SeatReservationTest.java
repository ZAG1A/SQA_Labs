package com.sqa.Lab9_TestDouble.service.lab9_2;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sqa.Lab9_TestDouble.service.lab9_2.SeatDAO;
import com.sqa.Lab9_TestDouble.service.lab9_2.SeatReservation;

@ExtendWith(MockitoExtension.class)
class SeatReservationTest {

    @Mock
    private SeatDAO seatDAO;

    @InjectMocks
    private SeatReservation seatReservation;

    @Test
    void testCheckSeatAvailability_SeatIsAvailable() throws SQLException {
        List<String> mockSeats = Arrays.asList("A1", "A2", "B5");
        when(seatDAO.fetchAvailableSeats()).thenReturn(mockSeats);

        boolean isAvailable = seatReservation.checkSeatAvailability("A1");

        assertTrue(isAvailable);
        verify(seatDAO, times(1)).fetchAvailableSeats();
    }

    @Test
    void testCheckSeatAvailability_SeatNotAvailable() throws SQLException {
        List<String> mockSeats = Arrays.asList("A1", "A2", "B5");
        when(seatDAO.fetchAvailableSeats()).thenReturn(mockSeats);

        boolean isAvailable = seatReservation.checkSeatAvailability("C10");

        assertFalse(isAvailable);
        verify(seatDAO, times(1)).fetchAvailableSeats();
    }
}