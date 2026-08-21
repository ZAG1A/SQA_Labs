package com.sqa.Lab9_TestDouble.service.lab9_1;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

import java.util.Arrays;
import java.util.List;

import com.sqa.Lab9_TestDouble.service.lab9_1.MovieService;

public class MovieServiceStub implements MovieService {
    @Override
    public List<String> getMoviesByLocationAndDate(String location, String date) {
        return Arrays.asList(
            "The Odyssey [VIP cinema]",
            "Spider-Man: Brand New Day [IMAX with Laser]",
            "The End of Oak Street [VIP cinema]"
        );
    }
}