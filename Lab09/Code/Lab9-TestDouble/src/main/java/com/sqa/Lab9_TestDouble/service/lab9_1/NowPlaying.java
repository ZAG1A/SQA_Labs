package com.sqa.Lab9_TestDouble.service.lab9_1;

/**
 * ชื่อ: นายอนันต์เอกก์ ใหญ่พงศกร
 * รหัสนักศึกษา: 673380430-9
 */

import java.util.ArrayList;
import java.util.List;

public class NowPlaying {
    private MovieService movieService;

    public NowPlaying(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<String> getNowPlayingByCinemaType(String location, String date, String cinemaType) {
        List<String> allMovies = movieService.getMoviesByLocationAndDate(location, date);
        List<String> filteredMovies = new ArrayList<>();

        for (String movie : allMovies) {
            if (movie.contains(cinemaType)) {
                filteredMovies.add(movie.replace(" [" + cinemaType + "]", ""));
            }
        }
        return filteredMovies;
    }
}