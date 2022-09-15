package com.ticketing.bs.repo;

import com.ticketing.bs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<User,Long> {
}
