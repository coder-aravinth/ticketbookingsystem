package com.ticketing.bs.repo;

import com.ticketing.bs.model.Screen;
import com.ticketing.bs.model.Ticket;
import com.ticketing.bs.model.TicketPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, TicketPk> {
}
