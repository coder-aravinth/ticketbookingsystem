package com.ticketing.bs.repo;

import com.ticketing.bs.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TheatreRepo extends JpaRepository<Theatre,Long> {
    public Optional<Theatre> findByTheatreName(String theatreName);
}
