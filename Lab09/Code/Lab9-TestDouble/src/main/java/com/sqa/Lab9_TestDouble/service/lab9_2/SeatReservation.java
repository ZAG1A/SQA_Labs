package com.sqa.Lab9_TestDouble.service.lab9_2;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

import java.sql.SQLException;
import java.util.List;

public class SeatReservation {

    private SeatDAO dao;

    public SeatReservation(SeatDAO dao) {
        this.dao = dao;
    }

    public boolean checkSeatAvailability(String seatName) throws SQLException {

        List<String> seatsAvailable = dao.fetchAvailableSeats();
        return seatsAvailable.contains(seatName);
    }

}