package com.ticketing.bs.repo;

import com.ticketing.bs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo  extends JpaRepository<User,Long> {

    public Optional<User> findByPhoneNumber(String phoneNumber);

    public Optional<User> findByEmailIdAndPhoneNumber(String email,String phoneNumber);
}
