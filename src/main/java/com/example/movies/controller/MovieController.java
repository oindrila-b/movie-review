package com.example.movies.controller;

import com.example.movies.entities.Movies;
import com.example.movies.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping()
    public ResponseEntity<List<Movies>> getAllMovies() {
        return new ResponseEntity<List<Movies>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId) {
                return new ResponseEntity<Optional<Movies>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }

}
