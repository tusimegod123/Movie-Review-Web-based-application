package dev.godwin.movies.services;

import dev.godwin.movies.models.Movie;
import dev.godwin.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<Movie> movies(){
        return movieRepository.findAll();
    }

    public Movie singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId).get();
    }
}
