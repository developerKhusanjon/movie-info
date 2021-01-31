package io.developerkhusanjon.movieinfo.controller;

import io.developerkhusanjon.movieinfo.resources.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieInfoController {

    @RequestMapping("{movie_id}")
    public List<Movie> getMovieDetails(@PathVariable("movie_id") String id){
        return List.of(
                new Movie("1234", "Hackers", "Documentary"),
                new Movie("1235", "Social Dilemma", "Documentary"),
                new Movie("1236", "BloodShot", "Fiction"),
                new Movie("1237", "Project Power", "Fiction")
        );
    }

}
