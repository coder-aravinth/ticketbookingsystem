package com.ticketing.bs.repo;

import com.ticketing.bs.model.Movie;
import com.ticketing.bs.model.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {
}
