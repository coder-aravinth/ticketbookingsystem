package com.ticketing.bs.service;

import com.ticketing.bs.model.User;
import com.ticketing.bs.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Optional<User> user (Long id){
        log.info("retrieve User for {}",id);
        return userRepo.findById(id);
    }
    public List<User> retrieveAllUser() {
        List<User> userList = userRepo.findAll();
        log.info("retrieve Users # {}",userList.size());
        return userList;
    }

    public Optional<User> retrieveByPhoneNumber (String phoneNumber) {
        return userRepo.findByPhoneNumber(phoneNumber);
    }

    public Optional<User> retrieveUserByEmailIdAndPhoneNumber (String phoneNumber,String emailId) {
        return userRepo.findByEmailIdAndPhoneNumber(emailId,phoneNumber);
    }
}
