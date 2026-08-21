package com.sqa.Lab9_TestDouble.service.lab9_1;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

import com.sqa.Lab9_TestDouble.service.lab9_1.MovieService;
import com.sqa.Lab9_TestDouble.service.lab9_1.NowPlaying;


class NowPlayingTest {

    @Test
    void testGetNowPlayingByCinemaType_VIPCinema_WithStub() {
        MovieService stub = new MovieServiceStub();
        NowPlaying nowPlaying = new NowPlaying(stub);

        List<String> vipMovies = nowPlaying.getNowPlayingByCinemaType("KKU Cinema", "2026-08-21", "VIP cinema");

        assertEquals(2, vipMovies.size());
        assertTrue(vipMovies.contains("The Odyssey"));
        assertTrue(vipMovies.contains("The End of Oak Street"));
    }
}