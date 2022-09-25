package com.ticketing.bs.service;

import com.ticketing.bs.model.Movie;
import com.ticketing.bs.repo.MovieRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class MovieService {
    @Autowired
    MovieRepo movieRepo;

    public Optional<Movie> retriveByMovieId(Long id){
        return movieRepo.findById(id);
    }

    public List<Movie> retriveAllMovie(){
        List<Movie> movieList = movieRepo.findAll();
        log.info("retrieve Movie # {}",movieList.size());
        return movieList;
    }

    public Movie saveMovie(Movie movie){
        log.info("save Movie for {}",movie.getMovieName());
        return movieRepo.save(movie);
    }

    public void deleteMovieById(Long id){
        log.info("delete Movie for {}",id);
        movieRepo.deleteById(id);
    }
}
