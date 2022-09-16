package com.ticketing.bs.repo;

import com.ticketing.bs.model.Screen;
import com.ticketing.bs.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepo extends JpaRepository<Screen,Long> {
}
