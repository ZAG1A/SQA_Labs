package com.sqa.Lab9_TestDouble.service.lab9_1;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */
import java.util.List;

public interface MovieService {
    List<String> getMoviesByLocationAndDate(String location, String date);
}