package com.ticketing.bs.service;

import com.ticketing.bs.model.Ticket;
import com.ticketing.bs.model.TicketPk;
import com.ticketing.bs.repo.TicketRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class TicketService {
    @Autowired
    TicketRepo ticketRepo;

    public Optional<Ticket> retriveTicketById (TicketPk id){
        log.info("retrieve ticket for {}",id);
        return ticketRepo.findById(id);
    }
    public List<Ticket> retriveByAvailableSeat(){
        List<Ticket> ticketList = ticketRepo.findAll();
        log.info("retrieve Tickets # {}",ticketList.size());
        return ticketList;
    }

    public void deleteTicketById(Ticket ticket){
        log.info("delete Ticket for {}",ticket.getId());
        ticketRepo.delete(ticket);
    }


}
