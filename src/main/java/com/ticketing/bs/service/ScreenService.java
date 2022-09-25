package com.ticketing.bs.service;

import com.ticketing.bs.model.Screen;
import com.ticketing.bs.repo.ScreenRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
@Slf4j
public class ScreenService {
    @Autowired
    ScreenRepo screenRepo;

    public Optional<Screen> retriveByScreenId(Long id){
        log.info("retrieve screen for {}",id);
        return screenRepo.findById(id);
    }

    public List<Screen> retriveAllScreen(){
        List<Screen> screenList = screenRepo.findAll();
        log.info("retrieve Screens # {}",screenList.size());
        return screenList;
    }

    public Screen saveScreen(Screen screen){
        log.info("save screen for {}",screen.getId());
        return screenRepo.save(screen);
    }
    public void deleteScreen(Long id){
        log.info("delete Screen for {}",id);
        screenRepo.deleteById(id);
    }
}
