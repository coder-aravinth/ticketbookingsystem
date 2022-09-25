package com.ticketing.bs.service;

import com.ticketing.bs.model.Theatre;
import com.ticketing.bs.repo.TheatreRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class TheatreService {

    @Autowired
    TheatreRepo theatreRepo;

    public Optional<Theatre> retriveById(Long id){
        log.info("retrieve theatre for {}",id);
        return theatreRepo.findById(id);
    }

    public List<Theatre> retriveAll(){
        List<Theatre> theatreList = theatreRepo.findAll();
        log.info("retrieve Theatre # {}",theatreList.size());
        return theatreList;
    }

    public Theatre saveTheatre(Theatre theatre){
        log.info("save Theatre for {}",theatre.getTheatreName());
        return theatreRepo.save(theatre);
    }

    public void deleteTheatreById(Long id){
        log.info("delete Theatre for {}",id);
        theatreRepo.deleteById(id);
    }


}
